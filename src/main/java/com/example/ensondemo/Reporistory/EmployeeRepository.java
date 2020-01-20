package com.example.ensondemo.Reporistory;

import com.example.ensondemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee save(Employee employee);
    List<Employee> findAll();
    void delete(Employee employee);
    Employee findByEmployeeId(Integer employeeId);
}
