package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Vaccine;
import com.example.demo.services.VaccineService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class VaccineController {

	@Autowired
	VaccineService vs;
	
	@GetMapping("/getallvaccine")
	public List<Vaccine> getAll()
	{
		return vs.getAllVaccine();
	}
	
	@PostMapping("/savevaccine")
	public Vaccine saveV (@RequestBody Vaccine sv)
	{
		return vs.saveVaccine(sv);
	}
}
