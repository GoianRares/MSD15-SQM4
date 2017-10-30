package org.app.service.entities;

import java.sql.Date;

public class Bug {
Integer bug_id;
String bug_description;
Date created_date;
Date due_date;
Priority priority;
Project project_id;
Project project_name;
Severity severity;
String status;
Date updated_date;
Project_user user_id;
String comments;
String bug_name;
public Integer getBug_id() {
	return bug_id;
}
public void setBug_id(Integer bug_id) {
	this.bug_id = bug_id;
}
public String getBug_description() {
	return bug_description;
}
public void setBug_description(String bug_description) {
	this.bug_description = bug_description;
}
public Date getCreated_date() {
	return created_date;
}
public void setCreated_date(Date created_date) {
	this.created_date = created_date;
}
public Date getDue_date() {
	return due_date;
}
public void setDue_date(Date due_date) {
	this.due_date = due_date;
}
public Priority getPriority() {
	return priority;
}
public void setPriority(Priority priority) {
	this.priority = priority;
}
public Project getProject_id() {
	return project_id;
}
public void setProject_id(Project project_id) {
	this.project_id = project_id;
}
public Project getProject_name() {
	return project_name;
}
public void setProject_name(Project project_name) {
	this.project_name = project_name;
}
public Severity getSeverity() {
	return severity;
}
public void setSeverity(Severity severity) {
	this.severity = severity;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Date getUpdated_date() {
	return updated_date;
}
public void setUpdated_date(Date updated_date) {
	this.updated_date = updated_date;
}
public Project_user getUser_id() {
	return user_id;
}
public void setUser_id(Project_user user_id) {
	this.user_id = user_id;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
public String getBug_name() {
	return bug_name;
}
public void setBug_name(String bug_name) {
	this.bug_name = bug_name;
}
public Bug(Integer bug_id, String bug_description, Date created_date, Date due_date, Priority priority,
		Project project_id, Project project_name, Severity severity, String status, Date updated_date,
		Project_user user_id, String comments, String bug_name) {
	super();
	this.bug_id = bug_id;
	this.bug_description = bug_description;
	this.created_date = created_date;
	this.due_date = due_date;
	this.priority = priority;
	this.project_id = project_id;
	this.project_name = project_name;
	this.severity = severity;
	this.status = status;
	this.updated_date = updated_date;
	this.user_id = user_id;
	this.comments = comments;
	this.bug_name = bug_name;
}
public Bug() {
	super();
}

}
