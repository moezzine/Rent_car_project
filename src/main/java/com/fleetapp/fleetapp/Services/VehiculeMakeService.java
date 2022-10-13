package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.VehiculeMakeRepository;
import com.fleetapp.fleetapp.Repositories.VehiculeRepository;
import com.fleetapp.fleetapp.models.VehicleMake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeMakeService {
    @Autowired
    VehiculeMakeRepository vehiculeMakeRepository;

    public List<VehicleMake> getVehiculeMake() {
        return  vehiculeMakeRepository.findAll();
    }

    public void saveVehiculeMake(VehicleMake vehiculeMake) {
        vehiculeMakeRepository.save(vehiculeMake);
    }

    public Optional<VehicleMake> getById(int id) {
        return  vehiculeMakeRepository.findById(id);
    }

    public void delete(Integer id) {
        vehiculeMakeRepository.deleteById(id);
    }

}
