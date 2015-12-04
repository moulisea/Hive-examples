package org.mouli.java.RestClientJson;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.htrace.fasterxml.jackson.core.JsonParseException;
import org.apache.htrace.fasterxml.jackson.databind.JsonMappingException;
import org.apache.htrace.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
	private static String driverName = "org.apache.hive.jdbc.HiveDriver";
    public static void main( String[] args ) throws SQLException, JsonParseException, JsonMappingException, IOException, ClassNotFoundException
    {
      	Class.forName(driverName);
    	Connection con = DriverManager.getConnection("jdbc:hive2://localhost:10000", "cloudera", "cloudera");
    	PreparedStatement stmt = con.prepareStatement("insert into table students values (?,?)");  	
    
    	ObjectMapper mapper = new ObjectMapper();
    	EmployeeList empList = mapper.readValue(new File("emplist.json"), EmployeeList.class);
    	for (Employee emp : empList.getEmployeeList())
    	{
    		stmt.setInt(1, emp.getId());
    		stmt.setString(2, emp.getName());
    		stmt.executeUpdate();
    		System.out.println("id=" + emp.getId());
    		System.out.println("id=" + emp.getName());
    	}
    	stmt.close();
    	con.close();
    }
}