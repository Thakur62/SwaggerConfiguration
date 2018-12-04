package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDetails {

	@JsonProperty("id")
	int id;
	
	@JsonProperty("country")
	String countryName;
	
	@JsonProperty("name")
	String nameInfo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getNameInfo() {
		return nameInfo;
	}

	public void setNameInfo(String nameInfo) {
		this.nameInfo = nameInfo;
	}
	
	
}
