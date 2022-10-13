package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.CountryRepository;
import com.fleetapp.fleetapp.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
   private  CountryRepository countryRepository;

    //RETURN LIST OF COUNTRIES//////
    public List<Country> getCountries(){
        return countryRepository.findAll();
    }
    public void saveCountry(Country country){
        countryRepository.save(country);
    }
    //get by Id//////
    public Optional<Country> getById(int id){
        return countryRepository.findById(id);
    }
    ///////DELETE COUNTRY//////////
    public void  delete(Integer id){
        countryRepository.deleteById(id);
    }
}
