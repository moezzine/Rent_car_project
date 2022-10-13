package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.VehiculeRepository;
import com.fleetapp.fleetapp.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeService {
    @Autowired
    VehiculeRepository vehiculeRepository;

    public void update(Vehicle vehicle) {
        vehiculeRepository.save(vehicle);
    }

    public void delete(int id) {
        vehiculeRepository.deleteById(id);
    }


    public List<Vehicle> get() {
        return  vehiculeRepository.findAll();
    }

    public Optional<Vehicle> find(int id) {
        return  vehiculeRepository.findById(id);
    }

    public void save(Vehicle vehicle) {
        vehiculeRepository.save(vehicle);
    }
}
