package com.example.demo.services;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Child;
import com.example.demo.entities.Hospital;
import com.example.demo.entities.Parent;
import com.example.demo.entities.Vaccine;
import com.example.demo.entities.VaccineProgress;
import com.example.demo.repositories.VaccineProgressRepository;

@Service
public class VaccineProgressService {

	@Autowired
	VaccineProgressRepository vpr;
	
	public List<VaccineProgress> getAllVaccineProgress()
	{
		return vpr.findAll();
	}
	
	public VaccineProgress saveVaccineProgress(VaccineProgress mh)
	{
		return vpr.save(mh);
	}
	
	public List<VaccineProgress> getChildInfo(int childid) {
		return vpr.getChildInfo( childid);
	}
	
	public VaccineProgress addProgress(Child cid,Vaccine vid,Hospital hid,Parent pid,String edate,String adate,String status,float price)
	{
		return vpr.saveInfo(cid, vid, hid, pid, edate, adate, status, price);
	}

}
