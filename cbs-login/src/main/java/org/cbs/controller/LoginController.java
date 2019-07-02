package org.cbs.controller;


import org.cbs.model.UserCredentials;
import org.cbs.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/")
    public boolean login(@RequestBody final UserCredentials user){
        System.out.println(user);
        return loginService.authenticateUser(user);
    }

}
