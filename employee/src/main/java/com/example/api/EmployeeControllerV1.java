package com.example.api;

import com.example.api.entity.EmployeeEntity;
import com.example.business.EmployeeServiceV1;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/rest/v1/employee")
public class EmployeeControllerV1 {

    private final EmployeeServiceV1 employeeServiceV1;

    public EmployeeControllerV1(EmployeeServiceV1 employeeServiceV1) {
        this.employeeServiceV1 = employeeServiceV1;
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(
            @PathVariable Integer employeeId) {

        EmployeeEntity employee  = employeeServiceV1.getEmployeeById(employeeId);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
        List<EmployeeEntity> employees = employeeServiceV1.getAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping("/create/by-admin")
    public ResponseEntity<EmployeeEntity> createEmployeeByAdmin(@Valid @RequestBody EmployeeEntity employeeEntity) {
        EmployeeEntity createdEmployee = employeeServiceV1.createEmployeeByAdmin(employeeEntity);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update/by-admin/{employeeId}")
    public ResponseEntity<EmployeeEntity> updateEmployeeByAdmin(
            @PathVariable Integer employeeId,
            @RequestBody EmployeeEntity employeeEntity
    ) {
        EmployeeEntity updatedEmployee = employeeServiceV1.updateEmployeeByAdmin(employeeId, employeeEntity);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/by-admin/{employeeId}")
    public ResponseEntity<EmployeeEntity> softDeleteEmployeeByAdmin(
            @PathVariable Integer employeeId
    ) {

        EmployeeEntity existingEmployee = employeeServiceV1.softDeleteEmployeeByAdmin(employeeId);
        return new ResponseEntity<>(existingEmployee, HttpStatus.OK);
    }

}