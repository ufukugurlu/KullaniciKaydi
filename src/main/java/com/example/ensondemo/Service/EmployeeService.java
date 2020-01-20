package com.example.ensondemo.Service;

import com.example.ensondemo.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    void save(Employee emp);
    List<Employee> listAll();
    Employee get( Integer employeeId);
    void delete(Integer employeeId);
}
