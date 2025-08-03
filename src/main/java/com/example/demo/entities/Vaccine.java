package com.example.demo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="mstr_vaccine")
public class Vaccine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vid;
	@Column
	private String vname;
	@Column
	private String vdesc;
	@Column
	private String brand;
	@Column
	private String type;
	@Column
	private float price;
	@Column
	private String agerange;
	
	/*@OneToMany(mappedBy = "vaccineid",cascade = CascadeType.ALL)
	List<VaccineProgress> mvp;*/

	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vaccine(String vname, String vdesc, String brand, String type, float price, String agerange) {
		super();
		this.vname = vname;
		this.vdesc = vdesc;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.agerange = agerange;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVdesc() {
		return vdesc;
	}

	public void setVdesc(String vdesc) {
		this.vdesc = vdesc;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getAgerange() {
		return agerange;
	}

	public void setAgerange(String agerange) {
		this.agerange = agerange;
	}

	
	
	
}
