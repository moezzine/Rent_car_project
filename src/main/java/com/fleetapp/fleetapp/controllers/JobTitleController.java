package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.JobTitleService;
import com.fleetapp.fleetapp.models.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class JobTitleController {
    @Autowired
    private JobTitleService jobTitleService;

    @GetMapping("/jobTitles")
    public String get(Model model){
        List<JobTitle> jobTitleList=jobTitleService.getjobTitle();
        model.addAttribute("jobTitles",jobTitleList);
        return "JobTitle";
    }
    @PostMapping("/jobTitles/addnew")
    public String add(JobTitle jobTitle){
        jobTitleService.savejobTitle(jobTitle);
        return "redirect:/jobTitles";
    }
    @RequestMapping("/jobTitles/findById")
    @ResponseBody
    public Optional<JobTitle> getById(int id){
        return jobTitleService.getById(id);
    }

    @RequestMapping(value="/jobTitles/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(JobTitle jobTitle){
        jobTitleService.savejobTitle(jobTitle);
        return "redirect:/jobTitles";
    }
    @RequestMapping(value="/jobTitles/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        jobTitleService.delete(id);
        return "redirect:/jobTitles";
    }
}
