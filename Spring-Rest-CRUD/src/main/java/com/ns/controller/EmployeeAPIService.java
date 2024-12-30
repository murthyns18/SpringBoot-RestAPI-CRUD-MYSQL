package com.ns.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ns.model.Employee;
import com.ns.serviceimpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeAPIService {

    // Injecting the service implementation
    @Autowired
    private EmployeeServiceImpl empservimpl;

    // Insert an employee
    @PostMapping
    public String insertEmployee(@RequestBody Employee employee) {
        return empservimpl.insertEmployee(employee);
    }

    // Get an employee by ID
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") int id) 
    {
    	return empservimpl.getEmployee(id);
        
    }

    // Update an employee
    @PutMapping
    public String updateEmployee(@RequestBody Employee employee) {
        return empservimpl.updateEmployee(employee);
    }

    // Get all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return empservimpl.getAllEmployees();
    }

    // Delete an employee by ID
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        return empservimpl.deleteEmployee(id);
    }
}
