package org.app.service.entities;

public class Priority {
String priority;
String description;
public String getPriority() {
	return priority;
}
public void setPriority(String priority) {
	this.priority = priority;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Priority(String priority, String description) {
	super();
	this.priority = priority;
	this.description = description;
}
public Priority() {
	super();
}

}
