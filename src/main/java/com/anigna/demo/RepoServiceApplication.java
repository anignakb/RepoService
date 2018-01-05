package com.anigna.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anigna.demo.model.Employee;
import com.anigna.demo.repository.EmployeeRepository;
import com.anigna.demo.service.EmployeeService;

@SpringBootApplication
public class RepoServiceApplication implements CommandLineRunner{
	
	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(RepoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(1002,"Kumar", 3, "Software Developer" );
		System.out.println(employeeService.insert(e1));
		
	}
}
