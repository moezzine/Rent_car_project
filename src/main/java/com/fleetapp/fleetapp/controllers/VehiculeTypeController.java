package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.VehiculeTypeService;
import com.fleetapp.fleetapp.models.VehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehiculeTypeController {
    @Autowired
    private VehiculeTypeService vehiculeTypeService;

    @GetMapping("/vehiculeTypes")
    public String getlocations(Model model){
        List<VehicleType> locationList=vehiculeTypeService.getVehiculeType();
model.addAttribute("vehiculeTypes", locationList);
        return "VehiculeType";
    }
    @PostMapping("/vehiculeTypes/addnew")
    public String addCountry(VehicleType vehicleType){
        vehiculeTypeService.saveVehiculeType(vehicleType);
        return "redirect:/vehiculeTypes";
    }
    @RequestMapping("/vehiculeTypes/findById")
    @ResponseBody
    public Optional<VehicleType> getById(int id){
        return vehiculeTypeService.getById(id);
    }

    @RequestMapping(value="/vehiculeTypes//update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(VehicleType vehicleType){
        vehiculeTypeService.saveVehiculeType(vehicleType);
        return "redirect:/vehiculeTypes";
    }
    @RequestMapping(value="/vehiculeTypes/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        vehiculeTypeService.delete(id);
        return "redirect:/vehiculeTypes";
    }
}
