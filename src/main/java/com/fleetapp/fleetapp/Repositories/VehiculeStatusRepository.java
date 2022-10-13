package com.fleetapp.fleetapp.Repositories;

import com.fleetapp.fleetapp.models.Client;
import com.fleetapp.fleetapp.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeStatusRepository extends JpaRepository<VehicleStatus,Integer> {


}
