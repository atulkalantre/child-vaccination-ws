package com.example.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "mstr_parent")
public class Parent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int parentid;
	
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String email;
	@Column
	private long contactno;
	@Column
	private String address;
	@Column
	private long aadharno;
	

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "loginid")
	@JsonProperty(access = Access.WRITE_ONLY)
	Login loginid;

	/*@OneToMany(mappedBy = "mstrparent", cascade = CascadeType.ALL)
	List<MasterChild> mc;
	
	@OneToMany(mappedBy = "mstrparent1")	
	List<MasterVaccineProgress> mstrvp;*/
	
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Parent(int parentid, String fname, String lname, String email, long contactno, String address, long aadharno) {
		super();
		this.parentid = parentid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contactno = contactno;
		this.address = address;
		this.aadharno = aadharno;
	}




	public Parent(String fname, String lname, String email, long contactno, String address, long aadharno,
			Login loginid) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contactno = contactno;
		this.address = address;
		this.aadharno = aadharno;
		this.loginid = loginid;
		
	}
	


	public Parent(String fname, String lname, String email, long contactno, String address, long aadharno) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contactno = contactno;
		this.address = address;
		this.aadharno = aadharno;
	}



	public int getParentid() {
		return parentid;
	}

	public void setParentid(int parentid) {
		this.parentid = parentid;
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



	public Login getLoginid() {
		return loginid;
	}



	public void setLoginid(Login loginid) {
		this.loginid = loginid;
	}

	

	
	
	
}
