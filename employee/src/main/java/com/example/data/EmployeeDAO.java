package com.example.data;

import com.example.api.entity.EmployeeEntity;
import com.example.database.mapper.EmployeeModelDynamicSqlSupport;
import com.example.database.mapper.EmployeeModelMapper;
import com.example.database.model.EmployeeModel;
import com.example.utils.DBUtils;
import jakarta.validation.Valid;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.database.mapper.EmployeeModelDynamicSqlSupport.employeeModel;

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
        return employeeModelMapper.selectDistinct(dsl->dsl
                .where(employeeModel.endTs, DBUtils.isDateInFuture())
        );
    }
}