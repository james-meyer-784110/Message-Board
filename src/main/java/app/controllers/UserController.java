package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/user")
public class UserController {

    @GetMapping("/login")
    public String getLogin(){
        return null;
    }

    @PostMapping("/login")
    public String postLogin(){
        return null;
    }

    @GetMapping("/sign-up")
    public String getSignUp(){
        return null;
    }

    @PostMapping("/sign-up")
    public String postSignUp(){
        return null;
    }

}