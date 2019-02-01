package com.example.demo;

public class User {

	private int id;

	private String country;

	private String name;

	public User() {
	}

	public User(int id, String country, String name) {
		this.id = id;
		this.country = country;
		this.name = name;
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
