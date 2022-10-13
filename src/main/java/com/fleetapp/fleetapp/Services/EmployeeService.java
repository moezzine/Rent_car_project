package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.EmployeeRepository;
import com.fleetapp.fleetapp.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> get() {
        return employeeRepository.findAll();
    }

    public void saveemployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Optional<Employee> getById(int id) {
        return  employeeRepository.findById(id);
    }

    public void delete(Integer id) {
        employeeRepository.deleteById(id);
    }
}
