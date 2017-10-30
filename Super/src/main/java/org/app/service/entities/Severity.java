package org.app.service.entities;

public class Severity {
String severity;
String description;
public String getSeverity() {
	return severity;
}
public void setSeverity(String severity) {
	this.severity = severity;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Severity(String severity, String description) {
	super();
	this.severity = severity;
	this.description = description;
}
public Severity() {
	super();
}

}
