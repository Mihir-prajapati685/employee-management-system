package com.example.utils;

import com.example.api.entity.RoleEntity;
import com.example.database.model.RoleModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class RoleTransformer {

    public RoleModel toModel(RoleEntity entity){
        if(Objects.isNull(entity)){
            return null;
        }
        RoleModel model = new RoleModel();
        BeanUtils.copyProperties(entity, model);
        return model;
    }
    public RoleEntity toEntity(RoleModel model){
        if(Objects.isNull(model)){
            return null;
        }
        RoleEntity entity = new RoleEntity();
        BeanUtils.copyProperties(model, entity);
        return entity;
    }

    public List<RoleEntity> toEntitList(List<RoleModel> modelList){
        if(Objects.isNull(modelList)){
            return null;
        }
        return modelList.stream().map(this::toEntity).toList();
    }

    public List<RoleModel> toModelList(List<RoleEntity> entityList){
        if(Objects.isNull(entityList)){
            return null;
        }
        return entityList.stream().map(this::toModel).toList();
    }
}