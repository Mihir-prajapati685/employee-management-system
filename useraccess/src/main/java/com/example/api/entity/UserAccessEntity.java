package com.example.api.entity;

import lombok.Data;

@Data
public class UserAccessEntity {
    private int userId;
    private String subUUID;
    private String userName;
    private String userRole;
}
