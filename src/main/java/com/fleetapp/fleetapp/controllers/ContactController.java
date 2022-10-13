package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.ContactService;
import com.fleetapp.fleetapp.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ContactController {
    @Autowired
    private ContactService contactService;
    @GetMapping("/contact")
public String getContact(Model model){
        List<Contact> listConatct=contactService.getContact();
        model.addAttribute("contact",listConatct);
        return "/Contact";
    }
    @PostMapping("/contact/addnew")
    public String addnew(Contact contact){
        contactService.save(contact);
        return "redirect:/contact";
    }
    @RequestMapping("/contact/findById")
    @ResponseBody
    public Optional<Contact> findById(int id){
        return contactService.findbyid(id);
    }
    @RequestMapping(value="/contact/update", method={RequestMethod.PUT,RequestMethod.GET})
    public String update(Contact contact){
        contactService.update(contact);
        return "redirect:/contact";
    }
    @RequestMapping(value="/contact/delete", method={RequestMethod.DELETE,RequestMethod.GET})
    public String update(int id){
        contactService.delete(id);
        return "redirect:/contact";
    }
}
