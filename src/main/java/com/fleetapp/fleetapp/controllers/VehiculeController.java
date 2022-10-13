package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.*;
import com.fleetapp.fleetapp.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehiculeController {

    @Autowired
    VehiculeService vehiculeService;
    @Autowired
    VehiculeTypeService vehiculeTypeService;
    @Autowired
    VehiculeMakeService vehiculeMakeService;
    @Autowired
    VehiculeModelService vehiculeModelService;
    @Autowired
    LocationService locationService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    VehiculeStatusService vehiculeStatusService;
    @GetMapping("/vehicule")
    public String get(Model model){
        List<Location> list=locationService.getlocation();
        model.addAttribute("locations",list);
        List<Vehicle> list1=vehiculeService.get();
        model.addAttribute("vehicule",list1);
        List<VehicleModel> list2=vehiculeModelService.getVehiculeModel();
        model.addAttribute("vehiculeModels",list2);
        List<VehicleMake> list3=vehiculeMakeService.getVehiculeMake();
        model.addAttribute("vehiculeMakes",list3);
        List<VehicleType> list4=vehiculeTypeService.getVehiculeType();
        model.addAttribute("vehiculeTypes",list4);
        List<VehicleStatus> list5=vehiculeStatusService.getVehiculeStatus();
        model.addAttribute("vehiculeStatus",list5);
        List<Employee> list6=employeeService.get();
        model.addAttribute("employee",list6);
        return "Vehicule";
    }
    @PostMapping("/vehicule/addnew")
    public  String addnew(Vehicle vehicle){
        vehiculeService.save(vehicle);
        return "redirect:/vehicule";    }
    @RequestMapping("/vehicule/findById")
    @ResponseBody
    public Optional<Vehicle> findById(int id){
        return vehiculeService.find(id);
    }
    @RequestMapping(value="/vehicule/update", method={RequestMethod.PUT,RequestMethod.GET})
    public String update(Vehicle vehicle){
        vehiculeService.update(vehicle);
        return "redirect:/vehicule";
    }
    @RequestMapping(value="/vehicule/delete", method={RequestMethod.DELETE,RequestMethod.GET})
    public String delete(int id){
        Object vehicleMovement;
        vehiculeService.delete(id);
        return "redirect:/vehicule";
    }
}
