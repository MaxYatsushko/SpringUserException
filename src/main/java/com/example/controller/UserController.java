package com.example.controller;

import com.example.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String Hello() {

        return "input user's data";
    }
    @GetMapping("/input")
    public String input(@RequestParam(name = "login") String login, @RequestParam(name = "password") String password, @RequestParam(name = "confirmPassword") String confirmPassword) {
        String result = UserService.checkData(login, password, confirmPassword);
        return result;
    }
}
