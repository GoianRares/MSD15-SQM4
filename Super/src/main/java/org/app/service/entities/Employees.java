package org.app.service.entities;

public class Employees {
Integer employee_id;
String employee_name;
String employee_email;
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
public Employees(Integer employee_id, String employee_name, String employee_email) {
	super();
	this.employee_id = employee_id;
	this.employee_name = employee_name;
	this.employee_email = employee_email;
}
public Employees() {
	super();
}


}
