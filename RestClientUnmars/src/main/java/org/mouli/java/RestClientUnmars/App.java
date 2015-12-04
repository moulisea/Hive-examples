package org.mouli.java.RestClientUnmars;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class App 
{
	private static String driverName = "org.apache.hive.jdbc.HiveDriver";
    public static void main( String[] args ) throws JAXBException, ClassNotFoundException, SQLException
    {
        unMarshallingExample();
    }
    private static void unMarshallingExample() throws JAXBException, SQLException, ClassNotFoundException {
    	Class.forName(driverName);
    	Connection con = DriverManager.getConnection("jdbc:hive2://localhost:10000", "cloudera", "cloudera");
    	PreparedStatement stmt = con.prepareStatement("insert into table students values (?,?)");  	
    	
    	JAXBContext jaxbContext = JAXBContext.newInstance(EmployeeList.class);
    	Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    	System.out.println("inside 1");
    	EmployeeList empList = (EmployeeList) jaxbUnmarshaller.unmarshal(new File("emplist.xml"));
    	System.out.println("inside 2");
    	for (Employee emp : empList.getEmployeeList())
    	{
    		stmt.setInt(1, emp.getId());
    		stmt.setString(2, emp.getName());
    		stmt.executeUpdate();
    		System.out.println("id=" +emp.getId());
    		System.out.println("name=" +emp.getName());
    	}
    	stmt.close();
    	con.close();
    }
}