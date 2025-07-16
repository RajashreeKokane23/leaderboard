package com.leadboard.model;

import java.time.LocalDateTime;

import jakarta.persistence.ManyToOne;

public class Claimhistory {
private Long id;
private int points;
private LocalDateTime claimedAt = LocalDateTime.now();

@ManyToOne
private User user;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public int getPoints() {
	return points;
}

public void setPoints(int points) {
	this.points = points;
}

public LocalDateTime getClaimedAt() {
	return claimedAt;
}

public void setClaimedAt(LocalDateTime claimedAt) {
	this.claimedAt = claimedAt;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public void setTimestamp(LocalDateTime now) {
	// TODO Auto-generated method stub
	
}
}
