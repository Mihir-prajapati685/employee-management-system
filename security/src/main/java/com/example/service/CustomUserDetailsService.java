package com.example.service;

import com.example.api.database.mapper.UserModelMapper;
import com.example.api.database.model.UserModel;
import com.example.data.UserDAO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    private UserDAO userDAO;

    public CustomUserDetailsService(UserDAO userDAO){
        this.userDAO=userDAO;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserModel userModel=userDAO.getUserByEmail(email).orElse(null);
        assert userModel != null;
        return org.springframework.security.core.userdetails.User
                .withUsername(userModel.getEmail())
                .roles("USER")
                .build();
    }
}