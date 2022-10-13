package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.UserService;
import com.fleetapp.fleetapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public String goHome(){
        return "User";
    }

    @PostMapping("/user/addnew")
    public RedirectView add(User user, RedirectAttributes redir){
        userService.save(user);
        RedirectView redirectView=new RedirectView("/login",true);
        redir.addFlashAttribute("message","User successfully  engristered ");
        return redirectView;
    }
}
