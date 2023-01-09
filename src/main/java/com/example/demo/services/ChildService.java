package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Child;
import com.example.demo.entities.Parent;
import com.example.demo.repositories.ChildRepository;

@Service
public class ChildService {

	@Autowired
	ChildRepository mcr;
	
	public Child childSave (Child mc)
	{
		return mcr.save(mc);
	}
	
	public List<Child> getAllChild()
	{
		return mcr.findAll();
	}
	
	public List<Child>getChild(Parent parentid)
	{
		return mcr.getAllChild(parentid);
	}
	
	public void deleteChild(int childId) {
	     mcr.deleteById(childId);
	}

	
	
}
