package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "mstr_role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleid;
	
	@Column
	private String rolename;
	
	@Column
	private String roledesc;
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Role(int roleid) {
		super();
		this.roleid = roleid;
	}


	public Role(String rolename, String roledesc) {
		super();
		this.rolename = rolename;
		this.roledesc = roledesc;
		//this.ml = ml;
	}


	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRoledesc() {
		return roledesc;
	}

	public void setRoledesc(String roledesc) {
		this.roledesc = roledesc;
	}

}
