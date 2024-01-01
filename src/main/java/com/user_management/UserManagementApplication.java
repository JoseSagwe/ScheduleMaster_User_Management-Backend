package com.user_management;

import com.user_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	public int registerNewUserServiceMethodMethod(String fname, String lname, String email, String password){
		return userRepository.registerNewUser(fname,lname,email,password);
	}
}