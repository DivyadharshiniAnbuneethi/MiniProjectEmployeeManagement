package com.example.demo.Entity;


	import javax.persistence.Entity;

	import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="EmployeeMangement")
	public class Employee {

		@Id
		private Integer Eid;
		private String name;
		private double salary;
		private String designation;

		
		public Integer getEid() {
			return Eid;
		}

		public void setId(Integer Eid) {
			this.Eid = Eid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public Employee() {
		}

		public Employee(Integer Eid, String name, double salary, String designation) {
			super();
			this.Eid = Eid;
			this.name = name;
			this.salary = salary;
			this.designation = designation;
		}


		@Override
		public String toString() {
			return "Employee [Eid=" + Eid + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
		}

	}


