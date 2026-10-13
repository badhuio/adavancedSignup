package com.example.loginAdvanced.dao;

import com.example.loginAdvanced.entity.signupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface signupDao extends JpaRepository <signupEntity, Integer>{
//    Optional<signupEntity> findByEmail(String user);  (it getting email from db but existByEmail just check email exist or not)

    boolean existsByEmail(String email);

}
