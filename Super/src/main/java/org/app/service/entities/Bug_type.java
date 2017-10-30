package org.app.service.entities;

public class Bug_type {
Bug bug_id;
Bug bug_name;
Boolean bug_active;
public Bug getBug_id() {
	return bug_id;
}
public void setBug_id(Bug bug_id) {
	this.bug_id = bug_id;
}
public Bug getBug_name() {
	return bug_name;
}
public void setBug_name(Bug bug_name) {
	this.bug_name = bug_name;
}
public Boolean getBug_active() {
	return bug_active;
}
public void setBug_active(Boolean bug_active) {
	this.bug_active = bug_active;
}
public Bug_type(Bug bug_id, Bug bug_name, Boolean bug_active) {
	super();
	this.bug_id = bug_id;
	this.bug_name = bug_name;
	this.bug_active = bug_active;
}
public Bug_type() {
	super();
}

}
