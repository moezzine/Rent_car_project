package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.EmployeeRepository;
import com.fleetapp.fleetapp.Repositories.UserRepository;
import com.fleetapp.fleetapp.models.Employee;
import com.fleetapp.fleetapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    UserRepository userRepository;

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


    public Employee findByName(String un) {
        return employeeRepository.findByUsername(un);
    }
    public void assignusername(int id){
        Employee employee=employeeRepository.findById(id).orElse(null);
User user=userRepository.findByFirstnameAndLastname(employee.getFirstname(),employee.getLastname());
employee.setUsername(user.getUsername());
employeeRepository.save(employee);
    }
}
