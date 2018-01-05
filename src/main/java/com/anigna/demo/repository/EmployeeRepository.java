package com.anigna.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anigna.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}