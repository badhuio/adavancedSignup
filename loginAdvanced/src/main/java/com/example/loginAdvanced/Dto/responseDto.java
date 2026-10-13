package com.example.loginAdvanced.Dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class responseDto {

    @NotBlank(message = "result field is empty")
    private String result;

    @NotBlank(message = "message field is empty")
    private String message;
}
