package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.VehiculeHireRepository;
import com.fleetapp.fleetapp.models.VehicleHire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeHireService {
    @Autowired
    VehiculeHireRepository vehiculeHireRepository;
    public List<VehicleHire> get() {
        return  vehiculeHireRepository.findAll();

    }

    public void save(VehicleHire vehicleHire) {
        vehiculeHireRepository.save(vehicleHire);
    }

    public Optional<VehicleHire> find(int id) {
        return vehiculeHireRepository.findById(id);
    }

    public void update(VehicleHire vehicleHire) {
        vehiculeHireRepository.save(vehicleHire);
    }

    public void delete(int id) {
        vehiculeHireRepository.deleteById(id);
    }
}
