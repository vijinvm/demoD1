package com.example.demoD;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Guest {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
@ManyToOne
@JoinColumn(name="guest_id")
private Checkin checkin;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Checkin getCheckin() {
	return checkin;
}
public void setCheckin(Checkin checkin) {
	this.checkin = checkin;
}
}
