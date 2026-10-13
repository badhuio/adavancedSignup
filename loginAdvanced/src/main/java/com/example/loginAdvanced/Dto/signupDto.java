package com.example.loginAdvanced.Dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class signupDto {

    @AssertTrue(message = "TermsAccepted need to selected")
    public boolean terms_Accepted;

    @NotBlank(message = "Email need to fill")
    @Email(message="Email need proper format ")
    private String email;

    @NotBlank(message = "Full name need to fill")
    private String full_Name;

    @NotBlank(message = "Username need to fill")
    private String user_Name;

    @NotNull(message = "Dob need to fill")
    private LocalDate dob;

    @NotBlank(message = "Country need to fill")
    private String country;

    @NotBlank(message = "Password need to fill")
    @Size(min = 6, message="password need minimum 6 characters")
    private String password;

    @NotBlank( message = "password need to fill")
    @Size(min = 6, message = "password need minimum 6 characters")
    private String confirm_Password;

    @NotNull(message = "join date is empty")
    private LocalDateTime join_Date;
}
