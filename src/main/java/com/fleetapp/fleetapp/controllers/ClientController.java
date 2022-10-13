package com.fleetapp.fleetapp.controllers;

import com.fleetapp.fleetapp.Services.ClientService;
import com.fleetapp.fleetapp.Services.CountryService;
import com.fleetapp.fleetapp.Services.StateService;
import com.fleetapp.fleetapp.models.Client;
import com.fleetapp.fleetapp.models.Country;
import com.fleetapp.fleetapp.models.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ClientController {
    @Autowired
    ClientService clientService;
  @Autowired
  CountryService countryService;
  @Autowired
  StateService stateService;
  @GetMapping("/client")
    public String getClient(Model model){
      List<Client> clientList=clientService.findclient();
    List<Country> countryList=countryService.getCountries();
    List<State> stateList=stateService.getstates();
    model.addAttribute("client",clientList);
    model.addAttribute("countries",countryList);
    model.addAttribute("states",stateList);
      return "Client";
  }
  @PostMapping("/client/addnew")
    public String add(Client client){
      clientService.save(client);
      return "redirect:/client";
  }
  @RequestMapping("/client/findById")
  @ResponseBody
  public Optional<Client> finfById(int id){
    return clientService.getById(id);
  }
  @RequestMapping(value = "/client/update",method ={ RequestMethod.PUT,RequestMethod.GET})
  public  String update(Client client){
    clientService.save(client);
    return "redirect:/client";
  }
  @RequestMapping(value = "/client/delete",method ={ RequestMethod.DELETE,RequestMethod.GET})
  public String delete(int id){
    clientService.delete(id);
    return "redirect:/client";
  }
}
