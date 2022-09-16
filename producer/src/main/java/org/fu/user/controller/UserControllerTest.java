package org.fu.user.controller;

import javax.annotation.Resource;
import org.fu.user.service.api.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerTest {

    @Resource
    private UserService userService;


    @GetMapping("/getAllUser")
    public String getAllUser(){
        return userService.list().toString();
    }

}
