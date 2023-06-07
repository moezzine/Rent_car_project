package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
@Controller
public class profilController {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/profile")
    public String findByUserName(Model model, Principal princilal){
        String un=princilal.getName();
        model.addAttribute("employee", employeeService.findByName(un));
        return "/profile";
    }
}
