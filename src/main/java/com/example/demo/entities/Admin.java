package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mstr_admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminid;
	
	@Column
	private String name;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "loginid")
	//@JsonProperty(access = Access.READ_ONLY)
	Login loginid;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, Login loginid) {
		super();
		this.name = name;
		this.loginid = loginid;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Login getLoginid() {
		return loginid;
	}

	public void setLoginid(Login loginid) {
		this.loginid = loginid;
	}
	
	

}
