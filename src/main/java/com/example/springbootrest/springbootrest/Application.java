package com.example.springbootrest.springbootrest;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.springbootrest.springbootrest.dao.UserDao;
import com.example.springbootrest.springbootrest.model.User;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner init(UserDao userDao){
        return args -> {
            User user1 = new User();
            user1.setFirstName("Devglan");
            user1.setLastName("Devglan");
            user1.setSalary(12345);
            user1.setAge(23);
            user1.setUsername("devglan");
            user1.setPassword("devglan");
            user1.setGender("Male");
            userDao.save(user1);

            User user2 = new User();
            user2.setFirstName("John");
            user2.setLastName("Doe");
            user2.setSalary(4567);
            user2.setAge(34);
            user2.setGender("Male");
            user2.setUsername("john");
            user2.setPassword("john");
            userDao.save(user2);
        };
    }

}
