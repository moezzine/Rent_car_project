package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.UserService;
import com.fleetapp.fleetapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

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
    @RequestMapping("/user/findById")
    @ResponseBody
    public Optional<User> getById(int id){
        return userService.getById(id);
    }
    @RequestMapping(value="/user/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(User user){
        userService.save(user);
        return "redirect:/user";
    }
    @RequestMapping(value="/user/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        userService.delete(id);
        return "redirect:/user";
    }
}
