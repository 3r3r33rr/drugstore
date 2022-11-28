package com.example.webproject.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String name;
    private String pwd;
}