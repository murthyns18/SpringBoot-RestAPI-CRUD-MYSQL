package com.ns.service;

import java.util.List;

import com.ns.model.Employee;

public interface EmployeeService
{
	public String insertEmployee(Employee e);
	public String updateEmployee(Employee e);
	public String deleteEmployee(int id);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployees();
	
}
