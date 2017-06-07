package org.EmployeeRepository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentDao {

	JDBCConnectionFactory connection = new JDBCConnectionFactory();
	PreparedStatement pStatement;
	ResultSet rs = null;
	Connection conn;

	public Department getDepartment(int empId) throws IOException {
		Department depDao = new Department();
		conn = connection.createConnection();

		try {
			pStatement = conn.prepareStatement("SELECT dept_no FROM dept_emp WHERE emp_no= ?");

			pStatement.setInt(1, empId);
			rs = pStatement.executeQuery();

			while (rs.next()) {

				depDao.setDeptNo(rs.getString("dept_no"));

				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return depDao;

	}
}
