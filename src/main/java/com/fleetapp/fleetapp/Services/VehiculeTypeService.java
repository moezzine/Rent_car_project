package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.VehiculeTypeRepository;
import com.fleetapp.fleetapp.models.VehicleType;
import com.fleetapp.fleetapp.models.VehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeTypeService {
    @Autowired
    VehiculeTypeRepository vehiculeTypeRepository;

    public List<VehicleType> getVehiculeType() {
        return  vehiculeTypeRepository.findAll();
    }

    public void saveVehiculeType(VehicleType vehiculeType) {
        vehiculeTypeRepository.save(vehiculeType);
    }

    public Optional<VehicleType> getById(int id) {
        return  vehiculeTypeRepository.findById(id);
    }

    public void delete(Integer id) {
        vehiculeTypeRepository.deleteById(id);
    }
}
