package com.ns.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ns.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	
}	
