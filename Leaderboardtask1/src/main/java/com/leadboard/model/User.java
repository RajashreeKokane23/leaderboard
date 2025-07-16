package com.leadboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String name;
private int totalPoints;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTotalPoints() {
	return totalPoints;
}
public void setTotalPoints(int totalPoints) {
	this.totalPoints = totalPoints;
}
}
