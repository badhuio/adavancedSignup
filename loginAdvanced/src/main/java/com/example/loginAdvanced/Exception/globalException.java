package com.example.loginAdvanced.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class globalException {

    public static final Logger log = LoggerFactory.getLogger(globalException.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> globalExceptionHandler(Exception ex){
            log.error(ex.getMessage(),ex);
        return ResponseEntity
                .status(400)
                .body(ex.getMessage());
    }
}
