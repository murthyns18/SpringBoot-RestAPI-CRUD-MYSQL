package com.ns.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ns.model.Employee;
import com.ns.repository.EmployeeRepository;
import com.ns.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	EmployeeRepository emprepo;
	
	@Override
	public String insertEmployee(Employee e) 
	{
		emprepo.save(e);
		return "Inserted successfully";
	}

	@Override
	public String updateEmployee(Employee e)
	{
		emprepo.save(e);
		return "Updated successfully";
	}

	@Override
	public String deleteEmployee(int id)
	{
		if(emprepo.existsById(id))
		{
			
			emprepo.deleteById(id);
			return "Deleted successfully";
		}
		else
		{
			return "No such employee exist";
		}
	}

	@Override
	public Employee getEmployee(int id) 
	{
	 
		Employee e = emprepo.findById(id).orElse(null);
		return e;
		
	}

	@Override
	public List<Employee> getAllEmployees() 
	{
		return emprepo.findAll();
	}
	
}
