package com.example.demo.DTOs;

import lombok.Data;

@Data
public class LoginRequest {
    private String userName;
    private String password;
}