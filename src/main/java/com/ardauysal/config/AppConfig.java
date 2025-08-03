package com.ardauysal.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ardauysal.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public List<Employee> employeeList(){
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1","Enes","Bayram"));
		employeeList.add(new Employee("2","Arda","Uysal"));
		employeeList.add(new Employee("3","Buğra","Uysal"));
		employeeList.add(new Employee("4","Talha","Uysal"));
		employeeList.add(new Employee("5","Yasin","Yazıcı"));
		
		return employeeList;
	}
}
