package org.app.service.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Assign {
	@Id
Integer assign_id;
Bug bug_id;
Employees employee_id;
Bug_status bug_status;
Date actual_finish_date;
Date estimated_finish_date;
public Integer getAssign_id() {
	return assign_id;
}
public void setAssign_id(Integer assign_id) {
	this.assign_id = assign_id;
}
public Bug getBug_id() {
	return bug_id;
}
public void setBug_id(Bug bug_id) {
	this.bug_id = bug_id;
}
public Employees getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(Employees employee_id) {
	this.employee_id = employee_id;
}
public Bug_status getBug_status() {
	return bug_status;
}
public void setBug_status(Bug_status bug_status) {
	this.bug_status = bug_status;
}
public Date getActual_finish_date() {
	return actual_finish_date;
}
public void setActual_finish_date(Date actual_finish_date) {
	this.actual_finish_date = actual_finish_date;
}
public Date getEstimated_finish_date() {
	return estimated_finish_date;
}
public void setEstimated_finish_date(Date estimated_finish_date) {
	this.estimated_finish_date = estimated_finish_date;
}
public Assign(Integer assign_id, Bug bug_id, Employees employee_id, Bug_status bug_status, Date actual_finish_date,
		Date estimated_finish_date) {
	super();
	this.assign_id = assign_id;
	this.bug_id = bug_id;
	this.employee_id = employee_id;
	this.bug_status = bug_status;
	this.actual_finish_date = actual_finish_date;
	this.estimated_finish_date = estimated_finish_date;
}
public Assign() {
	super();
}

}
