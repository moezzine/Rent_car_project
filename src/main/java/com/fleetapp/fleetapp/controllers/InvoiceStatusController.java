package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.InvoiceStatusService;
import com.fleetapp.fleetapp.Services.JobTitleService;
import com.fleetapp.fleetapp.models.InvoiceStatus;
import com.fleetapp.fleetapp.models.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class InvoiceStatusController {
    @Autowired
    private InvoiceStatusService invoiceStatusService;

    @GetMapping("/invoiceStatus")
    public String get(Model model){
        List<InvoiceStatus> invoiceStatusList=invoiceStatusService.getinvoiceStatus();
        model.addAttribute("invoiceStatus",invoiceStatusList);
        return "invoiceStatus";
    }
    @PostMapping("/invoiceStatus/addnew")
    public String add(InvoiceStatus invoiceStatus){
        invoiceStatusService.saveinvoiceStatus(invoiceStatus);
        return "redirect:/invoiceStatus";
    }
    @RequestMapping("/invoiceStatus/findById")
    @ResponseBody
    public Optional<InvoiceStatus> getById(int id){
        return invoiceStatusService.getById(id);
    }

    @RequestMapping(value="/invoiceStatus/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(InvoiceStatus invoiceStatus){
        invoiceStatusService.saveinvoiceStatus(invoiceStatus);
        return "redirect:/invoiceStatuss";
    }
    @RequestMapping(value="/invoiceStatus/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        invoiceStatusService.delete(id);
        return "redirect:/invoiceStatus";
    }
}
