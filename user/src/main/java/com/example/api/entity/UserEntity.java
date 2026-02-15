package com.example.api.entity;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Data
public class UserEntity {

    private Integer userId;
    private String subUUID;
    @NotBlank(message = "Email cannot be blank")
    private String email;
    @NotBlank(message = "Phone number cannot be blank")
    private String phoneNumber;
    private String verified;
    private Date effTs;
    private Date endTs;
}