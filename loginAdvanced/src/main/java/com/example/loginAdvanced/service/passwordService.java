package com.example.loginAdvanced.service;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class passwordService {

    private Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);

            public String hashPassword(String password){
                    log.trace("Password hashing started");
                return argon2.hash(2 /*hashing count*/,4096 /*ram used*/ ,1  /*1 task  at a time*/, password.toCharArray());
            }

            public boolean checkPassword(String password, String hash){
                    log.trace("Password checking started");
                return argon2.verify(hash, password.toCharArray());
            }

}
