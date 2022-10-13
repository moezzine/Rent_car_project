package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.EmployeeTypeService;
import com.fleetapp.fleetapp.Services.JobTitleService;
import com.fleetapp.fleetapp.models.EmployeeType;
import com.fleetapp.fleetapp.models.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeTypeController {
    @Autowired
    private EmployeeTypeService employeeTypeService;

    @GetMapping("/employeeTypes")
    public String get(Model model){
        List<EmployeeType> employeeTypeList=employeeTypeService.getemployeeType();
        model.addAttribute("employeeTypes",employeeTypeList);
        return "EmployeeType";
    }
    @PostMapping("/employeeTypes/addnew")
    public String add(EmployeeType employeeType){
        employeeTypeService.saveemployeeType(employeeType);
        return "redirect:/employeeTypes";
    }
    @RequestMapping("/employeeTypes/findById")
    @ResponseBody
    public Optional<EmployeeType> getById(int id){
        return employeeTypeService.getById(id);
    }

    @RequestMapping(value="/employeeTypes/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(EmployeeType employeeType){
        employeeTypeService.saveemployeeType(employeeType);
        return "redirect:/employeeTypes";
    }
    @RequestMapping(value="/employeeTypes/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        employeeTypeService.delete(id);
        return "redirect:/employeeTypes";
    }
}
