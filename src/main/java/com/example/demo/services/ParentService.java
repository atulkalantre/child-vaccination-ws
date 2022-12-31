package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Login;
import com.example.demo.entities.Parent;
import com.example.demo.entities.ParentRegister;
import com.example.demo.repositories.ParentRepository;

@Service
public class ParentService {

	@Autowired
	ParentRepository mpr;
	
	public List<Parent> getAllParent()
	{
		return mpr.findAll();
	}
	
	public Parent saveParent(Parent mp)
	{
		return mpr.save(mp);
	}
	public Parent getParent(long aadharno)
	{
		return mpr.getParent(aadharno);
	}
	
	public List<ParentRegister> getAllParentAdmin()
	{
		return mpr.getAllParent();
	}

	
	
}
