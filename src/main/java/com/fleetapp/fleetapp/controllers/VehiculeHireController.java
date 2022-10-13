package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.ClientService;
import com.fleetapp.fleetapp.Services.LocationService;
import com.fleetapp.fleetapp.Services.VehiculeHireService;
import com.fleetapp.fleetapp.Services.VehiculeService;
import com.fleetapp.fleetapp.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehiculeHireController {
    @Autowired
    VehiculeHireService vehiculeHireService;
    @Autowired
    VehiculeService vehiculeService;
    @Autowired
    LocationService locationService;
    @Autowired
    ClientService clientService;
    @GetMapping("/vehiculeHire")
    public String getHire(Model model){
        List<Location> list=locationService.getlocation();
        model.addAttribute("locations",list);
        List<VehicleHire> list1=vehiculeHireService.get();
        model.addAttribute("vehiculeHire",list1);
        List<Vehicle> list2=vehiculeService.get();
        model.addAttribute("vehicule",list2);
        List<Client> list3=clientService.findclient();
        model.addAttribute("client",list3);
        return "VehiculeHire";
    }
    @PostMapping("/vehiculeHire/addnew")
    public  String addnew(VehicleHire vehicleHire){
        vehiculeHireService.save(vehicleHire);
        return "redirect:/vehiculeHire";    }
    @RequestMapping("/vehiculeHire/findById")
    @ResponseBody
    public Optional<VehicleHire> findById(int id){
        return vehiculeHireService.find(id);
    }
    @RequestMapping(value="/vehiculeHire/update", method={RequestMethod.PUT,RequestMethod.GET})
    public String update(VehicleHire vehicleHire){
        vehiculeHireService.update(vehicleHire);
        return "redirect:/vehiculeHire";
    }
    @RequestMapping(value="/vehiculeHire/delete", method={RequestMethod.DELETE,RequestMethod.GET})
    public String delete(int id){
        Object vehicleHire;
        vehiculeHireService.delete(id);
        return "redirect:/vehiculeHire";
    }

}
