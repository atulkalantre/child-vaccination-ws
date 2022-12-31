package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "mstr_child")
public class Child {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	@Column	
	private String cfname;
	
	@Column
	private String clname;
	
	@Column
	private Date dob;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name ="parentid")
	//@JsonProperty(access = Access.WRITE_ONLY)
	Parent parentid;
	
	
	/*@OneToMany(mappedBy = "childvaccineprogress",cascade = CascadeType.ALL)
	List<MasterVaccineProgress> mvp;*/

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Child(String cfname, String clname, Date dob, Parent parentid) {
		super();
		this.cfname = cfname;
		this.clname = clname;
		this.dob = dob;
		this.parentid = parentid;
		//this.mvp = mvp;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCfname() {
		return cfname;
	}

	public void setCfname(String cfname) {
		this.cfname = cfname;
	}

	public String getClname() {
		return clname;
	}

	public void setClname(String clname) {
		this.clname = clname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}



	public Parent getParentid() {
		return parentid;
	}



	public void setParentid(Parent parentid) {
		this.parentid = parentid;
	}



	

	
	

	
	
}
