package com.saniago.tutorial.security.payload.request;


import lombok.Data;

@Data
public class SignupRequest {

    private String username;

    private String email;

    private String password;
}
