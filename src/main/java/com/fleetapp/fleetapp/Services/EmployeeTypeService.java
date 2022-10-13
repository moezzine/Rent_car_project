package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.EmployeeTypeRepository;
import com.fleetapp.fleetapp.Repositories.EmployeeTypeRepository;
import com.fleetapp.fleetapp.models.EmployeeType;
import com.fleetapp.fleetapp.models.EmployeeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {
    @Autowired
    EmployeeTypeRepository employeeTypeRepository;

    public List<EmployeeType> getemployeeType() {
        return  employeeTypeRepository.findAll();
    }

    public void saveemployeeType(EmployeeType employeeType) {
        employeeTypeRepository.save(employeeType);
    }

    public Optional<EmployeeType> getById(int id) {
        return  employeeTypeRepository.findById(id);
    }
    public void delete(Integer id) {
        employeeTypeRepository.deleteById(id);
    }
}
