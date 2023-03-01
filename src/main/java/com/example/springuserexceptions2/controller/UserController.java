package com.example.springuserexceptions2.controller;

import com.example.springuserexceptions2.exception.WrongLoginException;
import com.example.springuserexceptions2.exception.WrongPasswordException;
import com.example.springuserexceptions2.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String Hello() {

        return "input user's data";
    }
    @GetMapping("/input")
    public String input(@RequestParam(name = "login") String login, @RequestParam(name = "password") String password, @RequestParam(name = "confirmPassword") String confirmPassword) {
        boolean result = false;
        try {
            result = UserService.checkData(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            return "Input login again";
        } catch (WrongPasswordException e){
            return "Input password again";
        } catch (Exception e){
            return "Ooops... Shit happens. Try again";
        }
        return (result ? "Успех" : "Не успех");
    }
}
