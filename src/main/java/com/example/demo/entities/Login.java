package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "mstr_login")
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loginid;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name ="roleid")
	//@JsonProperty(access = Access.READ_ONLY)
	Role roleid;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Login(String username, String password, Role roleid) {
		super();
		this.username = username;
		this.password = password;
		this.roleid = roleid;
		
	}
	
	public Login(Role roleid) {
		super();
		this.roleid = roleid;
	}


	public int getLoginid() {
		return loginid;
	}


	public void setLoginid(int loginid) {
		this.loginid = loginid;
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


	public Role getRoleid() {
		return roleid;
	}


	public void setRoleid(Role roleid) {
		this.roleid = roleid;
	}
		
}
