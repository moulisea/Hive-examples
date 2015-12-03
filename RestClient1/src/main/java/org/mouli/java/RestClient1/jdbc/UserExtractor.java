package org.mouli.java.RestClient1.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.mouli.java.RestClient1.model.Employee;

public class UserExtractor implements ResultSetExtractor<Employee> {
	public Employee extractData(ResultSet resultSet) throws SQLException, DataAccessException{
		Employee emp = new Employee();
		
		emp.setId(resultSet.getInt(1));
		emp.setName(resultSet.getString(2));		
		return emp;
	}
}
