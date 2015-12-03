package org.mouli.java.RestClient1.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployeeList {
	private List<Employee> employeeList;
	protected EmployeeList(){
	}
	public EmployeeList(List<Employee> employeeList){
		this.employeeList = employeeList;
	}
	@javax.xml.bind.annotation.XmlElement(name="employee1")
	public List<Employee> getEmployeeList(){
		return employeeList;
	}
}
