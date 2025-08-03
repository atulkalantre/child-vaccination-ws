package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "mstr_vaccination_progress")
public class VaccineProgress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vpid;
	@Column
	private Date expdate;
	@Column
	private Date actualdate;
	@Column
	private String status;
	@Column
	private float price;

	//@OneToOne(cascade = CascadeType.MERGE)
	//@JoinColumn(name = "childid")
	// @JsonProperty(access = Access.READ_ONLY)
	@Column
	int childid;

	//@OneToOne(cascade = CascadeType.MERGE)
	//@JoinColumn(name = "vaccineid")
	// @JsonProperty(access = Access.READ_ONLY)
	@Column
	int vaccineid;

	//@OneToOne(cascade = CascadeType.MERGE)
	//@JoinColumn(name = "hospid")
	 //@JsonProperty(access = Access.READ_ONLY)
	@Column
	int hospid;

	//@OneToOne(cascade = CascadeType.MERGE)
	//@JoinColumn(name = "parentid")
	 //@JsonProperty(access = Access.READ_ONLY)
	@Column
	int parentid;

	public VaccineProgress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VaccineProgress(Date expdate, Date actualdate, String status, float price, int childid, int vaccineid,
			int hospid, int parentid) {
		super();
		this.expdate = expdate;
		this.actualdate = actualdate;
		this.status = status;
		this.price = price;
		this.childid = childid;
		this.vaccineid = vaccineid;
		this.hospid = hospid;
		this.parentid = parentid;
	}

	public int getVpid() {
		return vpid;
	}

	public void setVpid(int vpid) {
		this.vpid = vpid;
	}

	public Date getExpdate() {
		return expdate;
	}

	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}

	public Date getActualdate() {
		return actualdate;
	}

	public void setActualdate(Date actualdate) {
		this.actualdate = actualdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getChildid() {
		return childid;
	}

	public void setChildid(int childid) {
		this.childid = childid;
	}

	public int getVaccineid() {
		return vaccineid;
	}

	public void setVaccineid(int vaccineid) {
		this.vaccineid = vaccineid;
	}

	public int getHospid() {
		return hospid;
	}

	public void setHospid(int hospid) {
		this.hospid = hospid;
	}

	public int getParentid() {
		return parentid;
	}

	public void setParentid(int parentid) {
		this.parentid = parentid;
	}

	
}
