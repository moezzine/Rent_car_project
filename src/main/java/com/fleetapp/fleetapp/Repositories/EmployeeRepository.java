package com.fleetapp.fleetapp.Repositories;

import com.fleetapp.fleetapp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee findByUsername(String un);
}
