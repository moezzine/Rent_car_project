package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.VehiculeModelService;
import com.fleetapp.fleetapp.models.VehicleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehiculeModelController {
    @Autowired
    private VehiculeModelService vehiculeModelService;

    @GetMapping("/vehiculeModels")
    public String getlocations(Model model){
        List<VehicleModel> vehiculeModels=vehiculeModelService.getVehiculeModel();
        model.addAttribute("vehiculeModels",vehiculeModels);
        return "VehiculeModel";
    }
    @PostMapping("/vehiculeModels/addnew")
    public String addCountry(VehicleModel vehicleModel){
        vehiculeModelService.saveVehiculeModel(vehicleModel);
        return "redirect:/vehiculeModels";
    }
    @RequestMapping("/vehiculeModels/findById")
    @ResponseBody
    public Optional<VehicleModel> getById(int id){
        return vehiculeModelService.getById(id);
    }

    @RequestMapping(value="/vehiculeModels/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(VehicleModel vehicleModel){
        vehiculeModelService.saveVehiculeModel(vehicleModel);
        return "redirect:/vehiculeModels";
    }
    @RequestMapping(value="/vehiculeModels/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        vehiculeModelService.delete(id);
        return "redirect:/vehiculeModels";
    }
}
