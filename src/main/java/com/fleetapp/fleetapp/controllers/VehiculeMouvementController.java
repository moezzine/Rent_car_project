package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.LocationService;
import com.fleetapp.fleetapp.Services.VehiculeMouvementService;
import com.fleetapp.fleetapp.Services.VehiculeService;
import com.fleetapp.fleetapp.models.Location;
import com.fleetapp.fleetapp.models.Vehicle;
import com.fleetapp.fleetapp.models.VehicleMovement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehiculeMouvementController {
    @Autowired
    VehiculeMouvementService vehiculeMouvementService;
    @Autowired
    VehiculeService vehiculeService;
    @Autowired
    LocationService locationService;
    @GetMapping("/vehiculeMouvement")
    public String getMouvement(Model model){
        List<Location> list=locationService.getlocation();
        model.addAttribute("locations",list);
        List<VehicleMovement> list1=vehiculeMouvementService.get();
        model.addAttribute("vehiculeMouvement",list1);
        List<Vehicle> list2=vehiculeService.get();
        model.addAttribute("vehicule",list2);
        return "VehiculeMouvement";
    }
    @PostMapping("/vehiculeMouvement/addnew")
    public  String addnew(VehicleMovement vehicleMovement){
        vehiculeMouvementService.save(vehicleMovement);
        return "redirect:/vehiculeMouvement";    }
    @RequestMapping("/vehiculeMouvement/findById")
    @ResponseBody
    public Optional<VehicleMovement> findById(int id){
        return vehiculeMouvementService.find(id);
    }
@RequestMapping(value="/vehiculeMouvement/update", method={RequestMethod.PUT,RequestMethod.GET})
    public String update(VehicleMovement vehicleMovement){
        vehiculeMouvementService.update(vehicleMovement);
    return "redirect:/vehiculeMouvement";
}
    @RequestMapping(value="/vehiculeMouvement/delete", method={RequestMethod.DELETE,RequestMethod.GET})
    public String delete(int id){
        Object vehicleMovement;
        vehiculeMouvementService.delete(id);
        return "redirect:/vehiculeMouvement";
    }
}
