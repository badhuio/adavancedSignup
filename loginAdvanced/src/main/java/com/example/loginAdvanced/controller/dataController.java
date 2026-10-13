package com.example.loginAdvanced.controller;

import com.example.loginAdvanced.Dto.responseDto;
import com.example.loginAdvanced.Dto.signupDto;
import com.example.loginAdvanced.service.signupService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dataController {

    public static final Logger log = LoggerFactory.getLogger(dataController.class);

    @Autowired
    signupService signupService;

    @PostMapping("/signupUser")
    public responseDto signup(@Valid @RequestBody signupDto Dto){
            log.trace("data pass to save(service) for signup");
        return signupService.signup(Dto);
    }
}
