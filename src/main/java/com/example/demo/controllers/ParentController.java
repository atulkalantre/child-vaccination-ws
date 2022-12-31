package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Login;
import com.example.demo.entities.Parent;
import com.example.demo.entities.ParentRegister;
import com.example.demo.entities.Role;
import com.example.demo.services.LoginService;
import com.example.demo.services.ParentService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ParentController {

	@Autowired
	ParentService ps;
	
	@Autowired
	LoginService ls;
	
	
	@GetMapping("/getallparent")
	public List<Parent> getAll()
	{
		return ps.getAllParent();
	}
	
	@PostMapping("/saveparent")
	public Parent saveP (@RequestBody Parent mp)
	{
		return ps.saveParent(mp);
	}
	
	@PostMapping("/parentreg")
	public Parent regParent(@RequestBody ParentRegister pr)
	{
		Login l = new Login(pr.getUsername(),pr.getPassword(),new Role(101));
		Login inserted = ls.add(l);
		Parent p = new Parent(pr.getFname(),pr.getLname(),pr.getEmail(),pr.getContactno(),pr.getAddress(),pr.getAadharno(),inserted);
		return ps.saveParent(p);
	}
	@GetMapping("/getparentbyid/{ano}")
	public Parent getParent(@PathVariable ("ano") long aadharno)
	{
		return ps.getParent(aadharno);
	}
	
	@GetMapping("/getallparentadmin")
	public List<ParentRegister> getAllParentAdmin()
	{
		return ps.getAllParentAdmin();
	}
	
}
