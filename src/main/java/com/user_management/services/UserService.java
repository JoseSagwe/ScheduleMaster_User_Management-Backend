package com.user_management.services;

import com.user_management.models.User;
import com.user_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public int registerNewUserServiceMethod(String fname, String lname, String email, String password){
        return userRepository.registerNewUser(fname,lname,email,password);
    }
    //End of Register New User

    // Check User Email Services Method
    public List<String> checkUserEmail(String email){
        return userRepository.checkUserEmail(email);
    }
    // End of Check User Email Services Method

    // Check User Password Services Method
    public String checkUserPasswordByEmail(String email){
        return userRepository.checkUserPasswordByEmail(email);
    }
    // End of Check User Password Services Method

    //Get User Details By Email
    public User getUserDetailsByEmail(String email){
        return userRepository.GetUserDetailsByEmail(email);
    }
    //End of Get User Details By Email
}
