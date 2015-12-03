package org.mouli.java.RestClient1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.mouli.java.RestClient1.dao.EmployeeDao;
import org.mouli.java.RestClient1.model.Employee;
import org.mouli.java.RestClient1.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao empDao;
	
	//@Override
	public List<Employee> getEmpList(){
		return empDao.getEmpList();
	}
	
	public void addEmpList(Employee employee){
		empDao.addEmpList(employee);
	}
}
