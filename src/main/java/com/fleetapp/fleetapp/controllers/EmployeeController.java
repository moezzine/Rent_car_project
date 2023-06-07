package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.*;
import com.fleetapp.fleetapp.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeTypeService employeeTypeService;
    @Autowired
    private JobTitleService jobTitleService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private StateService stateService;
    @GetMapping("/employee")
        public  String getemployee(Model model){
        List<Employee> list=employeeService.get();
        model.addAttribute("employee",list);
        List<EmployeeType> list1=employeeTypeService.getemployeeType();
        model.addAttribute("employeeTypes",list1);
        List<Country> list2=countryService.getCountries();
        model.addAttribute("countries",list2);
        List<State> list3=stateService.getstates();
        model.addAttribute("states",list3);
        List<JobTitle> list4=jobTitleService.getjobTitle();
        model.addAttribute("jobTitles",list4);
        return "Employee";
    }
    @PostMapping("/employee/addnew")
    public String addEmployee(Employee employee){
        employeeService.saveemployee(employee);
        return "redirect:/employee";
    }
    @RequestMapping("/employee/findById")
    @ResponseBody
    public Optional<Employee> getById(int id){
        return employeeService.getById(id);
    }
    @RequestMapping(value="/employee/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Employee employee){
        employeeService.saveemployee(employee);
        return "redirect:/employee";
    }
    @RequestMapping(value="/employee/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        employeeService.delete(id);
        return "redirect:/employee";
    }
@RequestMapping("/employee/assginusername")
    public String assignusername(int id){
        employeeService.assignusername(id);
        return "redirect:/employee";
}
}
