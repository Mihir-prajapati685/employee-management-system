package com.example.data;

import com.example.api.database.mapper.EmployeeModelMapper;
import com.example.api.database.model.EmployeeModel;
import com.example.api.utils.DBUtils;
import com.example.api.utils.DateUtils;
import jakarta.validation.Valid;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.example.api.database.mapper.EmployeeModelDynamicSqlSupport.employeeModel;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Repository
public class EmployeeDAO {

    private final EmployeeModelMapper employeeModelMapper;

    public EmployeeDAO(EmployeeModelMapper employeeModelMapper) {
        this.employeeModelMapper = employeeModelMapper;
    }

    public EmployeeModel createEmployee(@Valid EmployeeModel employeeModel) {
        employeeModelMapper.insertSelective(employeeModel);
        return employeeModel;
    }

    public List<EmployeeModel> getAllEmployee() {
        return employeeModelMapper.selectDistinct(dsl -> dsl
                .where(employeeModel.endTs, DBUtils.isDateInFuture())
        );
    }

    public Optional<EmployeeModel> getEmployeeById(Integer employeeId) {

        return employeeModelMapper.selectOne(dsl -> dsl
                .where(employeeModel.employeeId, isEqualTo(employeeId))
                .and(employeeModel.endTs, DBUtils.isDateInFuture())
        );
    }

    public EmployeeModel updateEmployeeByAdmin(EmployeeModel model) {
        int updatedRows = employeeModelMapper.updateByPrimaryKeySelective(model);

        if (updatedRows == 0) {
            throw new RuntimeException("Employee is not found for this id");
        }
        return model;
    }

    public EmployeeModel softDeleteEmployeeByAdmin(Integer employeeId) {

        Optional<EmployeeModel> existingEmployeeOpt = getEmployeeById(employeeId);

        if (existingEmployeeOpt.isEmpty()) {
            throw new RuntimeException("Employee is not found for this id");
        }

        EmployeeModel existingEmployee = existingEmployeeOpt.get();
        existingEmployee.setEndTs(DateUtils.getNowInDate());

        int updatedRows = employeeModelMapper.updateByPrimaryKeySelective(existingEmployee);

        if (updatedRows == 0) {
            throw new RuntimeException("Failed to delete employee for this id");
        }
        return existingEmployee;
    }
}