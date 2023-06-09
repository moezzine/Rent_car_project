package com.fleetapp.fleetapp.controllers;
import com.fleetapp.fleetapp.Services.VehiculeMakeService;
import com.fleetapp.fleetapp.models.VehicleMake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Controller
public class VehiculeMakeController {
    @Autowired
    private VehiculeMakeService vehiculeMakeService;
    @GetMapping("/vehiculeMakes")
    public String get(Model model){
        List<VehicleMake> vehiculeMakes=vehiculeMakeService.getVehiculeMake();
        model.addAttribute("vehiculeMakes",vehiculeMakes);
        return "VehiculeMake";
    }
    @PostMapping("/vehiculeMakes/addnew")
    public String add(VehicleMake vehicleMake){
        vehiculeMakeService.saveVehiculeMake(vehicleMake);
        return "redirect:/vehiculeMakes";
    }
    @RequestMapping("/vehiculeMakes/findById")

    @ResponseBody
    public Optional<VehicleMake> getById(int id){
        return vehiculeMakeService.getById(id);
    }

    @RequestMapping(value="/vehiculeMakes/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(VehicleMake vehicleMake){
        vehiculeMakeService.saveVehiculeMake(vehicleMake);
        return "redirect:/vehiculeMakes";
    }

    @RequestMapping(value="/vehiculeMakes/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        vehiculeMakeService.delete(id);
        return "redirect:/vehiculeMakes";
    }

}
