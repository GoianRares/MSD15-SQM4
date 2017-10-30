package org.app.service.entities;

public class Employees_Role {
Integer employees_roles_id;
Employees employee_id;
String employee_role_description;
public Integer getEmployees_roles_id() {
	return employees_roles_id;
}
public void setEmployees_roles_id(Integer employees_roles_id) {
	this.employees_roles_id = employees_roles_id;
}
public Employees getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(Employees employee_id) {
	this.employee_id = employee_id;
}
public String getEmployee_role_description() {
	return employee_role_description;
}
public void setEmployee_role_description(String employee_role_description) {
	this.employee_role_description = employee_role_description;
}
public Employees_Role(Integer employees_roles_id, Employees employee_id, String employee_role_description) {
	super();
	this.employees_roles_id = employees_roles_id;
	this.employee_id = employee_id;
	this.employee_role_description = employee_role_description;
}
public Employees_Role() {
	super();
}

}
