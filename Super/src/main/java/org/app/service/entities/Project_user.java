package org.app.service.entities;

public class Project_user extends Employees{
Integer user_id;
Project project_id;
public Integer getUser_id() {
	return user_id;
}
public void setUser_id(Integer user_id) {
	this.user_id = user_id;
}
public Project getProject_id() {
	return project_id;
}
public void setProject_id(Project project_id) {
	this.project_id = project_id;
}
public Project_user(Integer employee_id, String employee_name, String employee_email, Integer user_id,
		Project project_id) {
	super(employee_id, employee_name, employee_email);
	this.user_id = user_id;
	this.project_id = project_id;
}
public Project_user(Integer employee_id, String employee_name, String employee_email) {
	super(employee_id, employee_name, employee_email);
}

}
