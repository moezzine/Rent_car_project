package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.CountryService;
import com.fleetapp.fleetapp.Services.StateService;
import com.fleetapp.fleetapp.models.Country;
import com.fleetapp.fleetapp.models.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {
    @Autowired
    private StateService stateService;
    @Autowired
    private CountryService countryService;
    @GetMapping("/states")
    public String getstates(Model model){
        List<State> stateList=stateService.getstates();
        model.addAttribute("states",stateList);
        List<Country> countryList=countryService.getCountries();
        model.addAttribute("countries",countryList);
        return "State";
    }
    @PostMapping("/states/addnew")
    public String addCountry(State state){
        stateService.saveState(state);
        return "redirect:/states";
    }
    @RequestMapping("/states/findById")
    @ResponseBody
    public Optional<State> getById(int id){
        return stateService.getById(id);
    }
    @RequestMapping(value="/states/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(State state){
        stateService.saveState(state);
        return "redirect:/states";
    }
    @RequestMapping(value="/states/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        stateService.delete(id);
        return "redirect:/states";
    }
}
