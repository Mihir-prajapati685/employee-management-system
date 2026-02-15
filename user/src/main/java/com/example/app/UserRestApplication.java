package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@SpringBootApplication
public class UserRestApplication {
    public static void main(String[] args) {
        //TIP To run Spring Boot application, press <shortcut actionId="Run"/> or
        // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        SpringApplication.run(UserRestApplication.class, args);

        //this is the main application class, it will run the spring boot application and start the server
    }
}