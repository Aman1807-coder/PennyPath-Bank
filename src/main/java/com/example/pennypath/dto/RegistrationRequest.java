package com.example.pennypath.dto;

import com.example.pennypath.entity.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class RegistrationRequest {

    @NotBlank(message = "FirstName is Required")
    private String firstName;
    private String lastName;
    private String phoneNumber;

    @Email
    @NotBlank(message = "Email is Required")
    private String email;

    @NotBlank(message = "Password is Required")
    private String password;

    private List<String> roles;
}
