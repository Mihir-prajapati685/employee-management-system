package com.example.utils;

import com.example.api.entity.UserEntity;
import com.example.api.database.model.UserModel;
import com.example.api.utils.BaseTransformer;

public class UserTransformer extends BaseTransformer<UserEntity, UserModel> {

    public UserTransformer(Class<UserEntity> entityClass, Class<UserModel> modelClass) {
        super(entityClass, modelClass);
    }
}
