package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.ClientService;
import com.fleetapp.fleetapp.Services.InvoiceService;
import com.fleetapp.fleetapp.Services.InvoiceStatusService;
import com.fleetapp.fleetapp.models.Client;
import com.fleetapp.fleetapp.models.Invoice;
import com.fleetapp.fleetapp.models.InvoiceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;
    @Autowired
    ClientService clientService;
    @Autowired
    InvoiceStatusService invoiceStatusService;
   @GetMapping("/invoice")
    public String getinvoices(Model model){
      List<Invoice> invoiceList=invoiceService.getinvoices();
      model.addAttribute("invoice", invoiceList);
      List<Client> clientList=clientService.findclient();
      List<InvoiceStatus> invoiceStatus=invoiceStatusService.getinvoiceStatus();
       model.addAttribute("client",clientList);
       model.addAttribute("invoiceStatus",invoiceStatus);
       return "Invoice";
   }
   @PostMapping(value="/invoice/addnew")
    public String addinvoice(Invoice invoice){
       invoiceService.saveinvoice(invoice);
       return "redirect:/invoice";
   }
   @RequestMapping("/invoice/findById")
   @ResponseBody
   public Optional<Invoice> findById(int id){
       return invoiceService.findById(id);
   }

   @RequestMapping(value = "/invoice/update",method={RequestMethod.PUT,RequestMethod.GET})
    public String updateinvoice(Invoice invoice ){
      invoiceService.saveinvoice(invoice); ;
      return  "redirect:/invoice";
    }
    @RequestMapping(value ="/invoice/delete",method={RequestMethod.DELETE,RequestMethod.GET})
    public String updateinvoice(int id ){
       invoiceService.delete(id);
       return "redirect:/invoice";

    }

}
