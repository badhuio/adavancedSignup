package com.example.loginAdvanced.service;

import com.example.loginAdvanced.Dto.responseDto;
import com.example.loginAdvanced.Dto.signupDto;
import com.example.loginAdvanced.dao.signupDao;
import com.example.loginAdvanced.entity.signupEntity;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class signupService {

    public static final Logger log = LoggerFactory.getLogger(signupService.class);

    @Autowired
    private signupDao signupDao;
    @Autowired
    private passwordService passwordService;

    @Transactional  // (used to rollback if any 1 method fail)
    public responseDto signup(signupDto Dto){

        String email = Dto.getEmail().trim().toLowerCase();  //(make the email in one standard format before checking it)

            if(signupDao.existsByEmail(email)){
                    log.warn("Signup email already exist");
                throw new RuntimeException("Email already exists");
            }

                signupEntity user = new signupEntity();

                    user.setTermsAccepted(Dto.isTerms_Accepted());
                    user.setEmail(Dto.getEmail());
                    user.setFullName(Dto.getFull_Name());
                    user.setUserName(Dto.getUser_Name());
                    user.setDob(Dto.getDob());
                    user.setCountry(Dto.getCountry());
                    user.setJoinDate(Dto.getJoin_Date());


            //password validation
            if(!Dto.getPassword().equals(Dto.getConfirm_Password())){
                    log.warn("password and confirm-password not match");
                throw new RuntimeException("Passwords do not match");
            }

            // Password encryption
            passwordService ps = new passwordService();

                String password = Dto.getPassword().trim();
                    log.trace("data ready to sent for hashing");
                  String hashPassword = passwordService.hashPassword(password);

                user.setPassword(hashPassword);
                    log.trace("data hashing successful");

                    signupEntity signupResult =  signupDao.save(user);  //(saving signup data's)
                    log.trace("signup-data saving successful");

                        responseDto responseDto = new responseDto();
                        responseDto.setMessage("signup success redirecting login !");
                        log.trace("signup-data convert to dto successful");

                return responseDto;
    }
}











/* (already checking in dto)
        if(!Dto.isTermsAccepted()){
            throw new RuntimeException(" please agree the Terms & Conditions");
        }*/

        //Optional<signupEntity> emailResult = signupDao.findByEmail(user.getEmail());