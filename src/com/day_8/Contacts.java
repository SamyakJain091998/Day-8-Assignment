package com.day_8;

public class Contacts {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private long zip;
	private long mobileNumber;
	private String emailId;
	
	public Contacts() {
		
	}
	
	public Contacts(String firstName, String lastName, String address, String city, String state, long zip, long mobileNumber, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	
	/////////SETTERS//////////
	
	public void setFirstName(String firstName) {
		 this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setZip(long zip) {
		this.zip = zip;
	}
	
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	//////////GETTERS//////////
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public long getZip() {
		return zip;
	}
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	@Override
	public String toString() {
		return ("First Name: "+this.getFirstName()+
	            " Last Name: "+ this.getLastName() +
	            " Address: "+ this.getAddress() +
	            " City : " + this.getCity() + " State: " + this.getState() + " Zip: " + this.getZip()
	            + " Mobile Number: " + this.getMobileNumber() + " Email Id: " + this.getEmailId());
	}

}