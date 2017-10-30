package org.app.service.entities;

public class Project {
Integer project_id;
String project_name;
String project_description;
public Integer getProject_id() {
	return project_id;
}
public void setProject_id(Integer project_id) {
	this.project_id = project_id;
}
public String getProject_name() {
	return project_name;
}
public void setProject_name(String project_name) {
	this.project_name = project_name;
}
public String getProject_description() {
	return project_description;
}
public void setProject_description(String project_description) {
	this.project_description = project_description;
}
public Project(Integer project_id, String project_name, String project_description) {
	super();
	this.project_id = project_id;
	this.project_name = project_name;
	this.project_description = project_description;
}
public Project() {
	super();
}


}
