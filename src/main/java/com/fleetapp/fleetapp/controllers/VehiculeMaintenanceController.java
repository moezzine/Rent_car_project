package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.SupplierService;
import com.fleetapp.fleetapp.Services.VehiculeMaintenanceService;
import com.fleetapp.fleetapp.Services.VehiculeService;
import com.fleetapp.fleetapp.models.Supplier;
import com.fleetapp.fleetapp.models.Vehicle;
import com.fleetapp.fleetapp.models.VehicleMaintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehiculeMaintenanceController {
   @Autowired
    private VehiculeMaintenanceService vehiculeMaintenanceService;
   @Autowired
    SupplierService supplierService;
   @Autowired
   private VehiculeService vehiculeService;
   @GetMapping("/vehiculeMaintenance")
    public String getCehiculeMaintenance(Model model){
       List<VehicleMaintenance> list=vehiculeMaintenanceService.get();
       model.addAttribute("vehiculeMaintenance",list);
       List<Supplier> list1=supplierService.getsupplier();
       model.addAttribute("supplier",list1);
       List<Vehicle> list2=vehiculeService.get();
       model.addAttribute("vehicule",list2);
       return "VehiculeMaintenance";
   }
   @PostMapping("/vehiculeMaintenance/addnew")
    public String addnew(VehicleMaintenance vehicleMaintenance){
       vehiculeMaintenanceService.add(vehicleMaintenance);
       return  "redirect:/vehiculeMaintenance";
   }
   @RequestMapping("/vehiculeMaintenance/findById")
    @ResponseBody
    public Optional<VehicleMaintenance> findVehicule(int id){
       return vehiculeMaintenanceService.find(id);
   }
   @RequestMapping(value="/vehiculeMaintenance/update", method = {RequestMethod.PUT,RequestMethod.GET})
    public String updtae(VehicleMaintenance vehicleMaintenance){
       vehiculeMaintenanceService.save(vehicleMaintenance);
       return  "redirect:/vehiculeMaintenance";
   }
    @RequestMapping(value="/vehiculeMaintenance/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(int id){
        vehiculeMaintenanceService.delete(id);
        return  "redirect:/vehiculeMaintenance";
    }
}
