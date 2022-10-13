package com.fleetapp.fleetapp.Repositories;

import com.fleetapp.fleetapp.models.Client;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends JpaRepository<Client,Integer> {

}
