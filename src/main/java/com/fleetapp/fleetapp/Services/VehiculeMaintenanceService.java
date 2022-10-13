package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.VihiculeMaintenanceRepository;
import com.fleetapp.fleetapp.models.VehicleMaintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeMaintenanceService {
    @Autowired
    private VihiculeMaintenanceRepository vihiculeMaintenanceRepository;
    public List<VehicleMaintenance> get() {
return vihiculeMaintenanceRepository.findAll();
    }

    public void add(VehicleMaintenance vehicleMaintenance) {
        vihiculeMaintenanceRepository.save(vehicleMaintenance);
    }

    public Optional<VehicleMaintenance> find(int id) {
        return vihiculeMaintenanceRepository.findById(id);
    }

    public void save(VehicleMaintenance vehicleMaintenance) {
        vihiculeMaintenanceRepository.save(vehicleMaintenance);
    }

    public void delete(int id) {
        vihiculeMaintenanceRepository.deleteById(id);
    }
}
