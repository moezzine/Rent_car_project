package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.CountryService;
import com.fleetapp.fleetapp.Services.LocationService;
import com.fleetapp.fleetapp.Services.StateService;
import com.fleetapp.fleetapp.models.Country;
import com.fleetapp.fleetapp.models.Location;
import com.fleetapp.fleetapp.models.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {
    @Autowired
    private StateService stateService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private LocationService locationService;

    @GetMapping("/locations")
    public String getlocations(Model model){
        List<Location> locationList=locationService.getlocation();
        model.addAttribute("locations",locationList);
        List<Country> countryList=countryService.getCountries();
        model.addAttribute("countries",countryList);
        List<State> stateList=stateService.getstates();
        model.addAttribute("states",stateList);
        return "Location";
    }
    @PostMapping("/locations/addnew")
    public String addCountry(Location location){
        locationService.saveLocation(location);
        return "redirect:/locations";
    }
    @RequestMapping("/locations/findById")
    @ResponseBody
    public Optional<Location> getById(int id){
        return locationService.getById(id);
    }

    @RequestMapping(value="/locations/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Location location){
        locationService.saveLocation(location);
        return "redirect:/locations";
    }
    @RequestMapping(value="/locations/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        locationService.delete(id);
        return "redirect:/locations";
    }
}
