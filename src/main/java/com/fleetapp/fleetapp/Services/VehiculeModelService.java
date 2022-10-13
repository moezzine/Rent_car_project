package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.VehiculeModelRepository;
import com.fleetapp.fleetapp.models.VehicleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeModelService {
    @Autowired
    VehiculeModelRepository vehiculeModelRepository;

    public List<VehicleModel> getVehiculeModel() {
        return  vehiculeModelRepository.findAll();
    }

    public void saveVehiculeModel(VehicleModel vehiculeModel) {
        vehiculeModelRepository.save(vehiculeModel);
    }

    public Optional<VehicleModel> getById(int id) {
        return  vehiculeModelRepository.findById(id);
    }

    public void delete(Integer id) {
        vehiculeModelRepository.deleteById(id);
    }

}
