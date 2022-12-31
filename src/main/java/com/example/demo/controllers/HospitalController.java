package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Hospital;
import com.example.demo.entities.HospitalRegister;
import com.example.demo.entities.Login;
import com.example.demo.entities.Role;
import com.example.demo.services.HospitalService;
import com.example.demo.services.LoginService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class HospitalController {

	@Autowired
	HospitalService hs;
	
	@Autowired
	LoginService ls;
	
			
	@GetMapping("/getallhospital")
	public List<Hospital> getAll()
	{
		return hs.getAllHospital();
	}
	
	@PostMapping("/savehospital")
	public Hospital saveH (@RequestBody Hospital mh)
	{
		return hs.saveHospital(mh);
	}
	
	@PostMapping("/hospitalreg")
	public Hospital regHosp(@RequestBody HospitalRegister hr)
	{
		Login l = new Login(hr.getUsername(),hr.getPassword(),new Role(102));
		Login inserted = ls.add(l);
		Hospital h = new Hospital(hr.getHospitalname(),hr.getEmail(),hr.getContact(),hr.getRegno(),hr.getAddress(),inserted);
		return hs.saveHospital(h);
	}
}
