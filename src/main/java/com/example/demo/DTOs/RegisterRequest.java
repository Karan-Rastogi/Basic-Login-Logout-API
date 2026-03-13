package com.example.demo.DTOs;  // ✅ notice the package

import lombok.Data;

@Data
public class RegisterRequest {
    private String userName;
    private String password;
}