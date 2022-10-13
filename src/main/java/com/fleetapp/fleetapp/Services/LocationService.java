package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.LocationRepository;
import com.fleetapp.fleetapp.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    LocationRepository locationRepository;

    public List<Location> getlocation() {
        return  locationRepository.findAll();
    }

    public void saveLocation(Location location) {
        locationRepository.save(location);
    }

    public Optional<Location> getById(int id) {
        return  locationRepository.findById(id);
    }

    public void delete(Integer id) {
        locationRepository.deleteById(id);
    }

}
