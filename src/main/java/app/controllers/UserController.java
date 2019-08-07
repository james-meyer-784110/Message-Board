package app.controllers;

import app.models.User;
import app.repos.UserRepo;
import app.views.UserSignupView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/sign-up")
    public String getSignUp(Model model){
        model.addAttribute("userSignupView", new UserSignupView());
        return "/user/sign-up";
    }

    @PostMapping("/sign-up")
    public String postSignUp(@ModelAttribute UserSignupView userSignupView){

        Optional<User> result = userSignupView.toUser();
        // TODO: no email or username protection
        if(result.isPresent()){
            User user = userSignupView.toUser().get();
            userRepo.save(user);
            return "redirect:/login";
        }else{
            return "redirect:/";
        }
    }

    @GetMapping("/login")
    public String getLogin(){
        return null;
    }

    @PostMapping("/login")
    public String postLogin(){
        return null;
    }

}