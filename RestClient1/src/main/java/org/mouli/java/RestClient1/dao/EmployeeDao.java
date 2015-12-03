package org.mouli.java.RestClient1.dao;

import org.mouli.java.RestClient1.model.*;

import java.util.List;

public interface EmployeeDao {
	
	//Get All
    public List<Employee> getEmpList();
    
    public void addEmpList(Employee employee);
    
}
