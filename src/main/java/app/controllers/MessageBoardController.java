package app.controllers;

import app.util.HtmlBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MessageBoardController {

    @GetMapping("/")
    public String getIndex(){
        //return HtmlBuilder.from("resources/index.html").orElse("404");
        return "index";
    }

}