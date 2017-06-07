package org.EmployeeRepository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {

	JDBCConnectionFactory connection = new JDBCConnectionFactory();
	PreparedStatement pStatement;
	ResultSet rs = null;
	Connection conn;

	public Employee getEmployee(int empId) throws IOException {
		Employee empDao = new Employee();
		conn = connection.createConnection();

		try {
			pStatement = conn.prepareStatement("SELECT * FROM employees WHERE emp_no= ?");

			pStatement.setInt(1, empId);
			rs = pStatement.executeQuery();

			while (rs.next()) {
				empDao.setEmpNo(rs.getInt("emp_no"));
				empDao.setFirstName(rs.getString("first_name"));
				empDao.setLastName(rs.getString("last_name"));
				empDao.setBirthDate(rs.getString("birth_date"));
				empDao.setGender(rs.getString("gender"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return empDao;

	}

}
