package org.mouli.java.RestClient1.services;

import java.util.List;

import org.mouli.java.RestClient1.model.Employee;

public interface EmployeeService {
	public List<Employee> getEmpList();
	public void addEmpList(Employee employee);
}
