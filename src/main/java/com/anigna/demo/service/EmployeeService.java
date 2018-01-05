package com.anigna.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anigna.demo.model.Employee;
import com.anigna.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public String insert(Employee emp) {
		if(employeeRepository.exists(emp.getEmployeeId())) {
			return "Employee Data Already Exist";
		}else {
			employeeRepository.save(emp);
			return "Employee Data Added Succesfully";
		}
	}	
}
