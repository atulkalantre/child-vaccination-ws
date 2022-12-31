package com.example.demo.entities;

public class ParentRegister {

	String fname;
	String lname;
	String email;
	long contactno;
	String address;
	long aadharno;
	String username;
	String password;
	
	public ParentRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public ParentRegister(String fname, String lname, String email, long contactno, String address, long aadharno,
			String username, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contactno = contactno;
		this.address = address;
		this.aadharno = aadharno;
		this.username = username;
		this.password = password;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getContactno() {
		return contactno;
	}



	public void setContactno(long contactno) {
		this.contactno = contactno;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public long getAadharno() {
		return aadharno;
	}



	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
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
