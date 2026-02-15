package com.example.utils;

import com.example.api.entity.EmployeeEntity;
import com.example.database.model.EmployeeModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeTransformer {

    public EmployeeModel toModel(EmployeeEntity entity){
        if(Objects.isNull(entity)){
            return null;
        }
        EmployeeModel model = new EmployeeModel();
        BeanUtils.copyProperties(entity, model);
        return model;
    }
    public EmployeeEntity toEntity(EmployeeModel model){
        if(Objects.isNull(model)){
            return null;
        }
        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(model, entity);
        return entity;
    }

    public List<EmployeeEntity> toEntitList(List<EmployeeModel> modelList){
        if(Objects.isNull(modelList)){
            return null;
        }
        return modelList.stream().map(this::toEntity).toList();
    }

    public List<EmployeeModel> toModelList(List<EmployeeEntity> entityList){
        if(Objects.isNull(entityList)){
            return null;
        }
        return entityList.stream().map(this::toModel).toList();
    }
}