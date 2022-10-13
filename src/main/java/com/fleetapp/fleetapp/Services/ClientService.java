package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.ClientRepository;
import com.fleetapp.fleetapp.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public void delete(int id) {
        clientRepository.deleteById(id);

    }

    public void save(Client client) {
        clientRepository.save(client);
    }

    public Optional<Client> getById(int id) {
       return  clientRepository.findById(id);

    }

    public List<Client> findclient() {
        return clientRepository.findAll();
    }
}
