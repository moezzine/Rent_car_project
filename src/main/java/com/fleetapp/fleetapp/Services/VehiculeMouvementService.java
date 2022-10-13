package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.VehiculeMouvementRepository;
import com.fleetapp.fleetapp.models.VehicleMovement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeMouvementService {
    @Autowired
    VehiculeMouvementRepository vehiculeMouvementRepository;

    public List<VehicleMovement> get() {
       return  vehiculeMouvementRepository.findAll();

    }

    public void save(VehicleMovement vehicleMovement) {
        vehiculeMouvementRepository.save(vehicleMovement);
    }

    public Optional<VehicleMovement> find(int id) {
        return vehiculeMouvementRepository.findById(id);
    }

    public void update(VehicleMovement vehicleMovement) {
        vehiculeMouvementRepository.save(vehicleMovement);
    }

    public void delete(int id) {
        vehiculeMouvementRepository.deleteById(id);
    }
}
