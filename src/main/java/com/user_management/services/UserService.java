package com.user_management.services;

import com.user_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public int registerNewUserServiceMethod(String fname, String lname, String email, String password){
        return userRepository.registerNewUser(fname,lname,email,password);
    }
}
