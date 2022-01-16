package com.example.demo.Controller;


	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.Implementation.EmployeeServiceImpl;


	
	@RestController
	public class EmployeeController {
		
		@GetMapping(path = "/")
		private String welcome() {
			return "Welcome!!!";
		}
		
		@Autowired
		EmployeeServiceImpl serviceImpl;
		
		
		@PostMapping( path="/employee")
		public Employee addEmployee(@RequestBody Employee employee) {
			return serviceImpl.addEmployee(employee);
		}
		
		@GetMapping(path= "/getemployee")
		private List<Employee> getEmployees() {
			return serviceImpl.getEmployees();
		}
		
		@PutMapping( path="/employee/{Eid}")
		private Employee updateEmployee(@PathVariable Integer Eid, @RequestBody Employee employee) {
			return serviceImpl.updateEmployee(Eid, employee);
		}
		
		@PutMapping(path="/update")
		public Employee updateEmployees(@RequestBody Employee employee)
		{
			return serviceImpl.updateEmployees( employee);
		}
		
		
		@GetMapping( path="/salary")
		public List<Employee> function(){
			return serviceImpl.descendingSalary();
		}
		
		@GetMapping(path="/employee/sort")
		public List<Employee> function2(){
			return serviceImpl.getEmployeesBySorting();
		}
		
		@DeleteMapping(path="/delete/{Eid}")
		public String deleteEmployee(@PathVariable int Eid)
		{
			return serviceImpl.deleteEmployee(Eid);
		}
		
	}


