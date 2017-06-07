package org.EmployeeApplication;

import java.io.IOException;
import java.util.Scanner;

import org.EmployeeServices.EmployeeInformations;
import org.EmployeeServices.EmployeeServices;

public class EmployeeApplication {

	public static void main(String[] args) throws IOException {

		EmployeeServices services = new EmployeeServices();
		int empId;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Employee ID: ");
		empId = scanner.nextInt();

		EmployeeInformations emp = services.getEmployeeInformation(empId);
		
		System.out.println("Employee ID: " + emp.getEmployee().getEmpNo());
		System.out.println("First Name: " + emp.getEmployee().getFirstName());
		System.out.println("Last Name: " + emp.getEmployee().getLastName());
		System.out.println("Birth Date: " + emp.getEmployee().getBirthDate());
		System.out.println("Gender: " + emp.getEmployee().getGender());
		System.out.println("Department Number: " + emp.getDepartment().getDeptNo());
		System.out.println("Salary: " + emp.getSalaries().getSalary());

		scanner.close();
	}

}
