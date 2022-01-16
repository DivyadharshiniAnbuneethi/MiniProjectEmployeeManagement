package com.example.demo.Service;

import java.util.List;


import com.example.demo.Entity.Employee;

public interface EmployeeService{

	public Employee addEmployee(Employee employee);
   	public List<Employee> getEmployees();
	public Employee updateEmployee(Integer Eid, Employee employee);
	public List<Employee> descendingSalary();
	public List<Employee> getEmployeesBySorting();
	
}
