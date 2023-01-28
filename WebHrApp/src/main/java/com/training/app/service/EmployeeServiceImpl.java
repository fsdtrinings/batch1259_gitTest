package com.training.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.app.entity.Employee;
import com.training.app.repository.EmployeeRepository;



@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployeeBasedOnSalary(int range1, int range2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeBasedOnId(int searchId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addNewEmployee(Employee e) {
		
		return employeeRepository.save(e);
	}

	@Override
	public Employee updateEmployeeSalary(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
