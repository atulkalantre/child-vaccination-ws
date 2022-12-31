package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Hospital;

import com.example.demo.repositories.HospitalRepository;


@Service
public class HospitalService {

	@Autowired
	HospitalRepository mhr;
	
	public List<Hospital> getAllHospital()
	{
		return mhr.findAll();
	}
	
	public Hospital saveHospital(Hospital mh)
	{
		return mhr.save(mh);
	}
}
