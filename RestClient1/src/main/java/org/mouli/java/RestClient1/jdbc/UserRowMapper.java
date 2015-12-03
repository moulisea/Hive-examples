package org.mouli.java.RestClient1.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.mouli.java.RestClient1.model.Employee;

public class UserRowMapper implements RowMapper<Employee> {
	@Override
	public Employee mapRow(ResultSet resultSet, int line) throws SQLException{
		UserExtractor userExtractor = new UserExtractor();
		return userExtractor.extractData(resultSet);
	}
}
