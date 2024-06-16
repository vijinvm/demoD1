package com.example.demoD;

import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

@Entity
public class Checkin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(mappedBy="guest",cascade=CascadeType.ALL)
	private List<Guest> guest;
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
	public List<Guest> getGuest() {
		return guest;
	}
	public void setGuest(List<Guest> guest) {
		this.guest = guest;
	}

	
}
