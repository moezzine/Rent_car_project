package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.CountryService;
import com.fleetapp.fleetapp.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {
    @Autowired
    private CountryService countryService;
    @GetMapping("/countries")
    public String getCountries(Model model){
        List<Country> countryList=countryService.getCountries();
        model.addAttribute("countries",countryList);
        return "Country";
    }
    @PostMapping("/countries/addnew")
    public String addCountry(Country country){
        countryService.saveCountry(country);
        return "redirect:/countries";
    }
    @RequestMapping("/countries/findById")
    @ResponseBody
        public Optional<Country> getById(int id){
        return countryService.getById(id);
        }
    @RequestMapping(value="/countries/update",method = {RequestMethod.PUT,RequestMethod.GET})
        public String update(Country country){
        countryService.saveCountry(country);
        return "redirect:/countries";
        }
    @RequestMapping(value="/countries/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        countryService.delete(id);
        return "redirect:/countries";
}

}

