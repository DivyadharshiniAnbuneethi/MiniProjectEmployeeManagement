package com.example.demo.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	List<Employee> findByOrderBySalaryDesc();


}
