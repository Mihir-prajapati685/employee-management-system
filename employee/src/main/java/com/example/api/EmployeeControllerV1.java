package com.example.api;

import com.example.api.entity.EmployeeEntity;
import com.example.business.EmployeeServiceV1;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/rest/employee/v1")
public class EmployeeControllerV1 {

    private final EmployeeServiceV1 employeeServiceV1;

    public EmployeeControllerV1(EmployeeServiceV1 employeeServiceV1) {
        this.employeeServiceV1 = employeeServiceV1;
    }

    @PostMapping("/create/by-admin")
    public ResponseEntity<EmployeeEntity> createEmployeeByAdmin(@Valid @RequestBody EmployeeEntity employeeEntity) {
        EmployeeEntity createdEmployee = employeeServiceV1.createEmployeeByAdmin(employeeEntity);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
        List<EmployeeEntity> employees = employeeServiceV1.getAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}