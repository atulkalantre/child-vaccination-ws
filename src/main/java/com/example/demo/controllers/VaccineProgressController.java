package com.example.demo.controllers;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Child;
import com.example.demo.entities.Hospital;
import com.example.demo.entities.Parent;
import com.example.demo.entities.Vaccine;
import com.example.demo.entities.VaccineProgress;
import com.example.demo.services.VaccineProgressService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Transactional
public class VaccineProgressController {

	@Autowired
	VaccineProgressService vps;
	
	@GetMapping("/getallprogress")
	public List<VaccineProgress> getAll()
	{
		return vps.getAllVaccineProgress();
	}
	
	@PostMapping("/saveprogress")
	public VaccineProgress saveVP (@RequestBody VaccineProgress sv)
	{
		return vps.saveVaccineProgress(sv);
	}
	@GetMapping("/getchildinfo/{childid}")
	public List<VaccineProgress> getChildInfo(@PathVariable ("childid") int childid)
	{
		return vps.getChildInfo( childid);
	}
	@PostMapping("/savechildprogress/{cid}/{vid}/{hid}/{pid}/{edate}/{adate}/{status}/{price}")
	public VaccineProgress saveInfo(@PathVariable("cid") Child cid,@PathVariable ("vid") Vaccine vid,@PathVariable ("hid")Hospital hid,@PathVariable ("pid") Parent pid,@PathVariable("edate") String edate,@PathVariable ("adate") String adate,@PathVariable("status") String status,@PathVariable("price") float price)
	{
		return vps.addProgress(cid, vid, hid, pid, edate, adate, status, price);
	}

}
