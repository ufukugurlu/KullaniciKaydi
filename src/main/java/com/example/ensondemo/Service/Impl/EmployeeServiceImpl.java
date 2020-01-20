package com.example.ensondemo.Service.Impl;

import com.example.ensondemo.Entity.Employee;
import com.example.ensondemo.Reporistory.EmployeeRepository;
import com.example.ensondemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void save(Employee emp) {
        employeeRepository.save(emp);

    }

    @Override
    public List<Employee> listAll() {
        return employeeRepository.findAll();
    }


    @Override
    public Employee get(Integer employeeId) {
        return  employeeRepository.findByEmployeeId(employeeId);
    }


    @Override
    public void delete(Integer id) {

        employeeRepository.delete(employeeRepository.findByEmployeeId(id));

    }
}
