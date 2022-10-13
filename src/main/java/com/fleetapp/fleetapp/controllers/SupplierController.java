package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.CountryService;
import com.fleetapp.fleetapp.Services.StateService;
import com.fleetapp.fleetapp.Services.SupplierService;
import com.fleetapp.fleetapp.models.Country;
import com.fleetapp.fleetapp.models.State;
import com.fleetapp.fleetapp.models.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private StateService stateService;

    @GetMapping("/supplier")
    public String GetSupplier(Model model){
        List<Supplier> supplierlist=supplierService.getsupplier();
        model.addAttribute("supplier",supplierlist);
        List<Country> countrylist=countryService.getCountries();
        model.addAttribute("countries", countrylist);
        List<State> statelist=stateService.getstates();
        model.addAttribute("states",statelist);
        return "Supplier";
    }
    @PostMapping("/supplier/addnew")
    public String addsupplier(Supplier supplier){
        supplierService.save(supplier);
        return "redirect:/supplier";
            }
    @RequestMapping("/supplier/findById")
    @ResponseBody
    public Optional<Supplier> find(int id){
        return supplierService.find(id);
    }
    @RequestMapping(value = "supplier/update",method={RequestMethod.PUT,RequestMethod.GET})
    public String update(Supplier supplier){
        supplierService.save(supplier);
            return "redirect:/supplier";
    }
    @RequestMapping(value = "supplier/delete",method={RequestMethod.DELETE,RequestMethod.GET})
    public String delete(int id){
        supplierService.delete(id);
        return "redirect:/supplier";
    }
}
