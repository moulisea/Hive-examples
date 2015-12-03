package org.mouli.java.RestClient1.dao;

import org.mouli.java.RestClient1.jdbc.*;
import org.mouli.java.RestClient1.model.*;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {

		@Autowired
		DataSource dataSource;
		
	    public List<Employee> getEmpList(){
	    	String tableName = "students";
			String sql = "select * from " +tableName;
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			List empList = new ArrayList();
			empList = jdbcTemplate.query(sql, new UserRowMapper());
			return empList;
		}
	    
	    public void addEmpList(Employee employee){
			String sql = "insert into table students values (?, ?)";
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			jdbcTemplate.update(sql, new Object[] {employee.getId(), employee.getName()});
			System.out.println("id= "+employee.getId());
			System.out.println("name= "+employee.getName());
		}
}

