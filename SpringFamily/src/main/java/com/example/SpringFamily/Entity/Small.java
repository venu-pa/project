package com.example.SpringFamily.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Small {
	@Id
	private int id;
	private String name;
	private int pincode;
	private String location;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Small [id=" + id + ", name=" + name + ", pincode=" + pincode + ", location=" + location + "]";
	}
	
	
	

}
