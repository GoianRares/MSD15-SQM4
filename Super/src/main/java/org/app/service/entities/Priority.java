package org.app.service.entities;

import java.util.*;
import javax.persistence.*;

@Entity
public class Priority {
	
	@Id
	@GeneratedValue //valoarea id-ului va fi incremetata automat
private Integer priority_id;

	@OneToMany
	@JoinColumn (name="priority", referencedColumnName="priority")
	private List<Bug>bugs;
	@Column(name="priority")
private String priority;
	
private String description;



//Getters, Setters and Contructors
public Integer getPriority_id() {
	return priority_id;
}

public void setPriority_id(Integer priority_id) {
	this.priority_id = priority_id;
}

public List<Bug> getBugs() {
	return bugs;
}

public void setBugs(List<Bug> bugs) {
	this.bugs = bugs;
}

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

public Priority(Integer priority_id, List<Bug> bugs, String priority, String description) {
	super();
	this.priority_id = priority_id;
	this.bugs = bugs;
	this.priority = priority;
	this.description = description;
}

public Priority() {
	super();
}




}
