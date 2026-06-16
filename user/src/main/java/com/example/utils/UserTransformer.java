package com.example.utils;

import com.example.api.entity.UserEntity;
import com.example.api.database.model.UserModel;
import com.example.api.utils.BaseTransformer;
import org.springframework.stereotype.Service;

@Service
public class UserTransformer extends BaseTransformer<UserEntity, UserModel> {

    public UserTransformer() {
        super(UserEntity.class, UserModel.class);
    }
}