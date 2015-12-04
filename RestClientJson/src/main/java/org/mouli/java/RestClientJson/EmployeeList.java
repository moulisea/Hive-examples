package org.mouli.java.RestClientJson;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployeeList {
	@XmlElement(name = "employee")
	private List<Employee> employeeList = null;
	
	public void EmployeeList(List<Employee> employeeList){
		this.employeeList = employeeList;
	}
	public List<Employee> getEmployeeList(){
		return employeeList;
	}
}
