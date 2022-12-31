package com.example.demo.entities;

public class HospitalRegister {

	String hospitalname;
	String email;
	long contact;
	String regno;
	String address;
	String username;
	String password;
	
	
	public HospitalRegister() {
		super();
		// TODO Auto-generated constructor stub
	}


	public HospitalRegister(String hospitalname, String email, long contact, String regno, String address,
			String username, String password) {
		super();
		this.hospitalname = hospitalname;
		this.email = email;
		this.contact = contact;
		this.regno = regno;
		this.address = address;
		this.username = username;
		this.password = password;
	}


	public String getHospitalname() {
		return hospitalname;
	}


	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	public String getRegno() {
		return regno;
	}


	public void setRegno(String regno) {
		this.regno = regno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
}
