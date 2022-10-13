package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.SupplierRepository;
import com.fleetapp.fleetapp.models.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {
    @Autowired
    SupplierRepository supplierRepository;

    public List<Supplier> getsupplier() {
       return supplierRepository.findAll();
    }

    public Optional<Supplier> find(int id) {
        return supplierRepository.findById(id);
    }

    public void save(Supplier suppllier) {
        supplierRepository.save(suppllier);
    }

    public void delete(int id) {
        supplierRepository.deleteById(id);
    }
}
