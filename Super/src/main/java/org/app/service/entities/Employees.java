package org.app.service.entities;

import javax.persistence.*;

@Entity
public class Employees {
	
	@Id
	@Column(name="employee_id")
	@GeneratedValue //valoarea id-ului va fi incremetata automat
private Integer employee_id;
		
private String employee_name;

private String employee_email;

private String employee_role;


//Getters, Setters and Contructors
public Integer getEmployee_id() {
	return employee_id;
}

public void setEmployee_id(Integer employee_id) {
	this.employee_id = employee_id;
}

public String getEmployee_name() {
	return employee_name;
}

public void setEmployee_name(String employee_name) {
	this.employee_name = employee_name;
}

public String getEmployee_email() {
	return employee_email;
}

public void setEmployee_email(String employee_email) {
	this.employee_email = employee_email;
}

public String getEmployee_role() {
	return employee_role;
}

public void setEmployee_role(String employee_role) {
	this.employee_role = employee_role;
}

public Employees(Integer employee_id, String employee_name, String employee_email, String employee_role) {
	super();
	this.employee_id = employee_id;
	this.employee_name = employee_name;
	this.employee_email = employee_email;
	this.employee_role = employee_role;
}

public Employees() {
	super();
}


}
