package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Child;
import com.example.demo.entities.Parent;
import com.example.demo.services.ChildService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ChildController {
	@Autowired
	ChildService cs;
	
	@GetMapping("/getallchild")
	public List<Child> getAllChild()
	{
		return cs.getAllChild();
	}
	@PostMapping("/savechild")
	public Child save(@RequestBody Child mc)
	{
		
		return cs.childSave(mc);
	}
	@GetMapping("/getchild/{pid}")
	public List<Child> getChild(@PathVariable ("pid") Parent pid)
	{
		
		return cs.getChild(pid);
	}
	
	@DeleteMapping("/deleteChild/{cid}")
	public void deleteChild(@PathVariable ("cid") int cid)
	{
		cs.deleteChild(cid);
	}
	
}
