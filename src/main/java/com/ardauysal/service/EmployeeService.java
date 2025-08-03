package com.ardauysal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ardauysal.model.Employee;
import com.ardauysal.model.UpdateEmployeeRequest;
import com.ardauysal.repository.EmployeeRepository;

@Service	
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployeeList(){
		
		return employeeRepository.getAllEmployeeList();
	}
	
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}
	
	public List<Employee> getEmployeeWithParams(String firstName, String lastName){
		return employeeRepository.getEmployeeWithParams(firstName, lastName);
	}
	
	public Employee saveEmployee(Employee newEmployee) {
		return employeeRepository.saveEmployee(newEmployee);
	}
	
	public boolean deleteEmployee(String id) {
		return employeeRepository.deleteEmployee(id);
	}
	
	public Employee updateEmployee(String id, UpdateEmployeeRequest request) {
		return employeeRepository.updatEmployee(id, request);
	}
}
