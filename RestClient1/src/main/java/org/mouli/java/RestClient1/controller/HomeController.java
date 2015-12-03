package org.mouli.java.RestClient1.controller;

import java.util.List;
import org.mouli.java.RestClient1.services.EmployeeService;
import org.mouli.java.RestClient1.model.Employee;
import org.mouli.java.RestClient1.model.EmployeeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value="/getList", method=RequestMethod.GET, produces= {"application/json", "application/xml"})			                                                    
	public @ResponseBody EmployeeList getEmployeeList(){
		List<Employee> employeeList = empService.getEmpList();
		return new EmployeeList(employeeList);	
	}
	
	@RequestMapping(value="/post", method=RequestMethod.POST, consumes= {"application/json", "application/xml"})			                                                    
	public @ResponseBody void addEmployee(@RequestBody Employee employee){
		empService.addEmpList(employee);	
	}
}