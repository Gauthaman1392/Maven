package org.EmployeeServices;

import org.EmployeeRepository.Department;
import org.EmployeeRepository.Employee;
import org.EmployeeRepository.Salaries;

public class EmployeeInformations {
	private Employee employee;
	private Department department;
	private Salaries salaries;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Salaries getSalaries() {
		return salaries;
	}
	public void setSalaries(Salaries salaries) {
		this.salaries = salaries;
	}

	
}
