package com.ca.order.domain;

import java.util.HashMap;
import java.util.Map;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getStreet() {
	return street;
	}

	public void setStreet(String street) {
	this.street = street;
	}

	public String getCity() {
	return city;
	}

	public void setCity(String city) {
	this.city = city;
	}

	public String getState() {
	return state;
	}

	public void setState(String state) {
	this.state = state;
	}

	public String getZip() {
	return zip;
	}

	public void setZip(String zip) {
	this.zip = zip;
	}

	public String getCountry() {
	return country;
	}

	public void setCountry(String country) {
	this.country = country;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}
	

}
