package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column(name = "name", length = 20, nullable = false)
private String name;
@Column(name = "number", length = 20, nullable = false)
private String number;
@Column(name = "country", length = 20, nullable = false)
private String country;
	
	
	

	

public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	
}
