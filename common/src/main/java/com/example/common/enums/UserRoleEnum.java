package com.example.common.enums;

import org.apache.catalina.User;

import java.util.HashMap;
import java.util.Map;

public enum UserRoleEnum {
    ADMIN,
    HR,
    EMPLOYEE,
    MANAGER,
    FINANCE;

    // Additional methods or fields can be added here if needed
    private static Map<String,UserRoleEnum> typeMap= new HashMap<>();

    static{
        for(UserRoleEnum roleEnum : UserRoleEnum.values()){
            typeMap.put(roleEnum.name(), roleEnum);
        }

    }
    public static UserRoleEnum fromString(String roleString){
        return typeMap.get(roleString);
    }
    public static String toString(UserRoleEnum roleEnum){
        return roleEnum.name();
    }
}