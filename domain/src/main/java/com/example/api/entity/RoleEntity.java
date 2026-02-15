package com.example.api.entity;

import lombok.Data;

import java.util.Date;

@Data
public class RoleEntity {

    private Integer roleId;
    private String roleName;
    private String roleDescription;
    private Date eff_ts;
    private Date end_ts;
}
