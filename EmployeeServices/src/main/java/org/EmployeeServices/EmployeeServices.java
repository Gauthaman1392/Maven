package org.EmployeeServices;

import java.io.IOException;

import org.EmployeeRepository.DepartmentDao;
import org.EmployeeRepository.EmployeeDao;
import org.EmployeeRepository.SalariesDao;

public class EmployeeServices {

	EmployeeDao empDao = new EmployeeDao();
	DepartmentDao depDao = new DepartmentDao();
	SalariesDao salDao = new SalariesDao();

	public EmployeeInformations getEmployeeInformation(int empId) throws IOException {
		EmployeeInformations empInfo = new EmployeeInformations();
		empInfo.setEmployee(empDao.getEmployee(empId));
		empInfo.setDepartment(depDao.getDepartment(empId));
		empInfo.setSalaries(salDao.getEmployeeSalary(empId));
		return empInfo;

	}

}
