package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.VehiculeModelRepository;
import com.fleetapp.fleetapp.Repositories.VehiculeStatusRepository;
import com.fleetapp.fleetapp.models.VehicleStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeStatusService {
    @Autowired
    VehiculeStatusRepository vehiculeStatusRepository;

    public List<VehicleStatus> getVehiculeStatus() {
        return  vehiculeStatusRepository.findAll();
    }

    public void saveVehiculeStatus(VehicleStatus vehiculeStatus) {
        vehiculeStatusRepository.save(vehiculeStatus);
    }

    public Optional<VehicleStatus> getById(int id) {
        return  vehiculeStatusRepository.findById(id);
    }

    public void delete(Integer id) {
        vehiculeStatusRepository.deleteById(id);
    }
}
