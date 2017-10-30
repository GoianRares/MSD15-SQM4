package org.app.service.entities;

public class Bug_status {
String status;
String description;
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Bug_status(String status, String description) {
	super();
	this.status = status;
	this.description = description;
}
public Bug_status() {
	super();
}

}
