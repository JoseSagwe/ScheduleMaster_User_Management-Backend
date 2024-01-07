package com.user_management.rest_controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api/v1")
public class UserApiController {


    @GetMapping("/test")
    public String test(){
        return "The Rest First End point is working";
    }


}
