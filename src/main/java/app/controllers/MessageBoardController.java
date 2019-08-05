package app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MessageBoardController {

    @GetMapping
    public String homePage(){
        return "Message Board";
    }

}