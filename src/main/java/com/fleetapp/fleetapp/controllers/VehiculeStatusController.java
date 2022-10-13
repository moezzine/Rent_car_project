package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.VehiculeStatusService;
import com.fleetapp.fleetapp.models.VehicleStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehiculeStatusController {
    @Autowired
    private VehiculeStatusService vehiculeStatusService;

    @GetMapping("/vehiculeStatus")
    public String getlocations(Model model){
        List<VehicleStatus> locationList=vehiculeStatusService.getVehiculeStatus();
        model.addAttribute("vehiculeStatus", locationList);
        return "VehiculeStatus";
    }
    @PostMapping("/vehiculeStatus/addnew")
    public String addCountry(VehicleStatus vehicleStatus){
        vehiculeStatusService.saveVehiculeStatus(vehicleStatus);
        return "redirect:/vehiculeStatus";
    }
    @RequestMapping("/vehiculeStatus/findById")
    @ResponseBody
    public Optional<VehicleStatus> getById(int id){
        return vehiculeStatusService.getById(id);
    }

    @RequestMapping(value="/vehiculeStatus/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(VehicleStatus vehicleStatus){
        vehiculeStatusService.saveVehiculeStatus(vehicleStatus);
        return "redirect:/vehiculeStatus";
    }
    @RequestMapping(value="/vehiculeStatus/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        vehiculeStatusService.delete(id);
        return "redirect:/vehiculeStatus";
    }
}
