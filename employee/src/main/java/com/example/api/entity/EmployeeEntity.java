package com.example.api.entity;

import com.example.common.enums.DepartmentEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

    private Integer employeeId;
    private String subUUID;

    @NotBlank(message = "First name cannot be empty or null")
    private String firstName;

    @NotBlank(message = "Last name cannot be empty or null")
    private String lastName;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email cannot be empty or null")
    private String email;

    @NotBlank (message = "Department cannot be empty or null")
    private DepartmentEnum department;
}
