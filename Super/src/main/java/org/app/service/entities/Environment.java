package org.app.service.entities;

public class Environment {
Integer environment_id;
String name;
String version;
public Integer getEnvironment_id() {
	return environment_id;
}
public void setEnvironment_id(Integer environment_id) {
	this.environment_id = environment_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getVersion() {
	return version;
}
public void setVersion(String version) {
	this.version = version;
}
public Environment(Integer environment_id, String name, String version) {
	super();
	this.environment_id = environment_id;
	this.name = name;
	this.version = version;
}
public Environment() {
	super();
}

}
