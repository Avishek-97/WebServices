package com.nt.model;

public class Address {
	private String city;
	private String state;
	public Address() {
		System.out.println("Address:: 0-param constructor");
	}
	public String getCity() {
		System.out.println("Address.getCity()");
		return city;
	}
	public void setCity(String city) {
		System.out.println("Address.setCity()");
		this.city = city;
	}
	public String getState() {
		System.out.println("Address.getState()");
		return state;
	}
	public void setState(String state) {
		System.out.println("Address.setState()");
		this.state = state;
	}
	@Override
	public String toString() {
		System.out.println("Address.toString()");
		return "Address [city=" + city + ", state=" + state + "]";
	}
}
