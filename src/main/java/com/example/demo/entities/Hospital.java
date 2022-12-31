package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="mstr_hospital")
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hospitalid;
	
	@Column
	private String hospitalname;
	@Column
	private String email;
	@Column
	private long contact;
	@Column
	private String regno;
	@Column
	private String address;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "loginid")
	@JsonProperty(access = Access.READ_WRITE)
	Login loginid;
		
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital(String hospitalname, String email, long contact, String regno, String address,
			Login loginid) {
		super();
		this.hospitalname = hospitalname;
		this.email = email;
		this.contact = contact;
		this.regno = regno;
		this.address = address;
		this.loginid = loginid;
		//this.mstrvp = mstrvp;
	}
	
	

	public Hospital(String hospitalname, String email, long contact, String regno, String address) {
		super();
		this.hospitalname = hospitalname;
		this.email = email;
		this.contact = contact;
		this.regno = regno;
		this.address = address;
	}

	public int getHospitalid() {
		return hospitalid;
	}

	public void setHospitalid(int hospitalid) {
		this.hospitalid = hospitalid;
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

	public Login getLoginid() {
		return loginid;
	}

	public void setLoginid(Login loginid) {
		this.loginid = loginid;
	}

	

	
}
