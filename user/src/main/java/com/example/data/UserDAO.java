package com.example.data;

import com.example.api.database.mapper.UserModelDynamicSqlSupport;
import com.example.api.database.mapper.UserModelMapper;
import com.example.api.database.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Repository
public class UserDAO {

    private final UserModelMapper userModelMapper;

    public UserDAO(UserModelMapper userModelMapper) {
        this.userModelMapper = userModelMapper;
    }

    public Optional<UserModel> getUserByEmail(String email) {
        return userModelMapper.selectOne(dsl ->
            dsl.where(UserModelDynamicSqlSupport.email, isEqualTo(email))
        );
    }

    public UserModel createNewUser(UserModel model) {
        userModelMapper.insertSelective(model);
        return model;
    }
}