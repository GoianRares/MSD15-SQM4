package org.app.service.entities;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity

public class Bug {
	
	@Id
	@Column(name="bug_id")
	@GeneratedValue //valoarea id-ului va fi incremetata automat
private Integer bug_id;
	
	@Column(name="bug_name")
private String bug_name;

private String bug_description;

	@Temporal(TemporalType.DATE)
private java.util.Date created_date;

	@Temporal(TemporalType.DATE)
private java.util.Date due_date;

	@ManyToOne
	@Column(name="priority")
private Priority priority;

	@ManyToOne
	@Column(name="project_id")
private Project project_id;

	@ManyToOne
	@Column(name="severity")
private Severity severity;

private String status;

	@Temporal(TemporalType.DATE)
private java.util.Date updated_date;

	@ManyToOne
	@Column(name="user_id")
private Project_user user_id;

private String comments;


//Maparea legaturii M-to-M dintre clasele Project_user si Bug prin intermediul clasei Project_user_Bug
@ManyToMany(mappedBy="project_bug")
private Set<Project_user> projectuser=new HashSet<>();



//Getters, Setters and Contructors

public Integer getBug_id() {
	return bug_id;
}


public void setBug_id(Integer bug_id) {
	this.bug_id = bug_id;
}


public String getBug_name() {
	return bug_name;
}


public void setBug_name(String bug_name) {
	this.bug_name = bug_name;
}


public String getBug_description() {
	return bug_description;
}


public void setBug_description(String bug_description) {
	this.bug_description = bug_description;
}


public java.util.Date getCreated_date() {
	return created_date;
}


public void setCreated_date(java.util.Date created_date) {
	this.created_date = created_date;
}


public java.util.Date getDue_date() {
	return due_date;
}


public void setDue_date(java.util.Date due_date) {
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


public java.util.Date getUpdated_date() {
	return updated_date;
}


public void setUpdated_date(java.util.Date updated_date) {
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


public Set<Project_user> getProjectuser() {
	return projectuser;
}


public void setProjectuser(Set<Project_user> projectuser) {
	this.projectuser = projectuser;
}


public Bug(Integer bug_id, String bug_name, String bug_description, java.util.Date created_date,
		java.util.Date due_date, Priority priority, Project project_id, Severity severity, String status,
		java.util.Date updated_date, Project_user user_id, String comments, Set<Project_user> projectuser) {
	super();
	this.bug_id = bug_id;
	this.bug_name = bug_name;
	this.bug_description = bug_description;
	this.created_date = created_date;
	this.due_date = due_date;
	this.priority = priority;
	this.project_id = project_id;
	this.severity = severity;
	this.status = status;
	this.updated_date = updated_date;
	this.user_id = user_id;
	this.comments = comments;
	this.projectuser = projectuser;
}


public Bug() {
	super();
}




}
