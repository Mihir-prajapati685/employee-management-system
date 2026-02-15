package com.example.business;

import com.example.api.entity.EmployeeEntity;
import com.example.api.entity.UserEntity;
import com.example.data.EmployeeDAO;
import com.example.utils.EmployeeTransformer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceV1 {

    private final EmployeeDAO employeeDAO;
    private final EmployeeTransformer employeeTransformer;
    private final UserService userService;

    public EmployeeServiceV1(EmployeeDAO employeeDAO, EmployeeTransformer employeeTransformer, UserService userService) {
        this.employeeDAO = employeeDAO;
        this.employeeTransformer = employeeTransformer;
        this.userService = userService;
    }

    public EmployeeEntity createEmployeeByAdmin(@Valid EmployeeEntity employeeEntity) {
        UserEntity userEntity = employeeEntity.getUserDetails();

        UserEntity user = userService.checkIfUserIsExists(userEntity);

        if(Objects.isNull(user)){
            userService.createNewUser(userEntity);
        }
        return employeeTransformer.toEntity(employeeDAO.createEmployee(employeeTransformer.toModel(employeeEntity)));
    }

    public List<EmployeeEntity> getAllEmployees() {
        return employeeTransformer.toEntitList(employeeDAO.getAllEmployee());
    }
}
