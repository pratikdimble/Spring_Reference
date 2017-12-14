package com.app.model;

public class address {
	private int addrid;
	private String location;
	private int pin;
	
	
	public address() {
		super();
		System.out.println("\t\t***WELCOME TO ADDRESS***");
	}
	public int getAddrid() {
		return addrid;
	}
	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "address [addrid=" + addrid + ", location=" + location + ", pin=" + pin + "]";
	}
	
	

}
