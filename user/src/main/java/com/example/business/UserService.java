package com.example.business;

import com.example.api.entity.UserEntity;
import com.example.data.UserDAO;
import com.example.utils.UserTransformer;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {

    private final UserDAO userDAO;
    private final UserTransformer userTransformer;

    public UserService(UserDAO userDAO,UserTransformer userTransformer) {
        this.userDAO = userDAO;
        this.userTransformer = userTransformer;
    }

    public UserEntity checkIfUserIsExists(UserEntity userEntity) {

        if(Objects.isNull(userEntity)){
            throw new RuntimeException("User details are required");
        }
        UserEntity user = checkUserByEmail(userEntity.getEmail());

        if(Objects.isNull(user)){
            return null;
        }
        return user;
    }

    private UserEntity checkUserByEmail(String email) {
        return userTransformer.toEntity(userDAO.getUserByEmail(email).orElse(null));
    }

    public UserEntity createNewUser(UserEntity userEntity) {

        if(Objects.isNull(userEntity)){
            throw new RuntimeException("User details are required");
        }
        return userTransformer.toEntity(userDAO.createNewUser(userTransformer.toModel(userEntity)));
    }
}
