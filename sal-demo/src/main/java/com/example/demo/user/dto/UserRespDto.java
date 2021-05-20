package com.example.demo.user.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRespDto {
    private Integer userId;
    private String name;
    private Integer age;
}
