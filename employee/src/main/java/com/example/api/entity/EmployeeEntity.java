package com.example.api.entity;

import com.example.common.enums.DepartmentEnum;
import com.example.common.enums.GenderEnum;
import com.example.common.enums.UserRoleEnum;
import com.example.common.enums.UserStatusEnum;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Data
public class EmployeeEntity {

    private Integer employeeId;
    private Integer userId;
    private String subUUID;
    @NotBlank(message = "Name cannot be blank")
    private String employeeName;
    @NotBlank(message = "Phone number cannot be blank")
    private String employeePhoneNumber;
    @NotBlank(message = "Address cannot be blank")
    private String employeeAddress;
    @NotBlank(message = "Gender cannot be blank")
    private GenderEnum gender;
    @NotBlank(message = "Date of birth cannot be blank")
    private Date dateOfBirth;
    private String profilePictureUrl;
    @NotBlank(message = "Role cannot be blank")
    private UserRoleEnum employeeRole;
    @NotBlank(message = "Department cannot be blank")
    private DepartmentEnum department;
    private UserStatusEnum employeeStatus;
    private UserEntity userDetails;
    private Date effTs;
    private Date endTs;
}