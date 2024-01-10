package com.user_management.rest_controllers;

import com.user_management.models.Login;
import com.user_management.models.User;
import com.user_management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Api/v1")
public class LoginApiController {

    @Autowired
    UserService userService;

    @PostMapping("/user/login")
    public ResponseEntity authenticateUser(@RequestBody Login login){

        //Get User Email
        List<String> userEmail = userService.checkUserEmail(login.getEmail());


        //Check If Email is Empty
        if(userEmail.isEmpty() || userEmail == null){
            return new ResponseEntity("Email does not exist" , HttpStatus.NOT_FOUND);
        }
        // End of Check If Email is Empty

        //Get Hashed user Password
        String hashed_password = userService.checkUserPasswordByEmail(login.getEmail());

        //Validate the user password
       if(!BCrypt.checkpw(login.getPassword(), hashed_password)){
           return new ResponseEntity("Incorrect Username Or password" , HttpStatus.BAD_REQUEST);
       }

       //Set User Object
        User user = userService.getUserDetailsByEmail(login.getEmail());
        return new ResponseEntity(user, HttpStatus.OK);
    }

}
