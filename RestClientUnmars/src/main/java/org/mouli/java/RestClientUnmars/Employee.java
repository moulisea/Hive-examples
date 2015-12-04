package org.mouli.java.RestClientUnmars;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")

public class Employee {
	private int id;
	private String name;
	
	public Employee(){}
	
	public Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return "{ID = " +id+ ", Name = " +name+ "}";
	}
}
