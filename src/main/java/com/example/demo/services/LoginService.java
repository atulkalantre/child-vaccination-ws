package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Admin;
import com.example.demo.entities.Hospital;
import com.example.demo.entities.Login;
import com.example.demo.entities.Parent;
import com.example.demo.entities.Role;
import com.example.demo.repositories.AdminRepository;
import com.example.demo.repositories.HospitalRepository;
import com.example.demo.repositories.LoginRepository;
import com.example.demo.repositories.ParentRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository mlr;
	
	@Autowired
	ParentRepository mpr;
	
	@Autowired
	HospitalRepository mhr;
	
	@Autowired
	AdminRepository mar;
	
	public Object checkLogin(String uname,String pwd)
	{
		List<Login> l = mlr.checkLogin(uname, pwd);
		System.out.println(l.size());
		if(l.size()==1)
		{
			//System.out.println((l.get(0)).getRoleid() +":"+(l.get(0)).getLoginid());
			
			Parent mp = null;
			Hospital mh = null;
			Admin ma =null;
			if(((l.get(0)).getRoleid()).getRoleid() == 101)
			{
				Optional<Parent> op = mpr.GetParent(l.get(0));
				try
				{
					//mp = op.get();
					return op;
				}
				catch(Exception e)
				{
					mp = null;
				}
			}
			else if(((l.get(0)).getRoleid()).getRoleid() == 102)
			{
				Optional<Hospital> op = mhr.GetHospital(l.get(0));
				try
				{
					//mp = op.get();
					return op;
				}
				catch(Exception e)
				{
					mh = null;
				}
				
			}
			else if(((l.get(0)).getRoleid()).getRoleid() == 103)
			{
				Optional<Admin> op = mar.GetAdmin(l.get(0));
				try
				{
					//mp = op.get();
					return op;
				}
				catch(Exception e)
				{
					ma = null;
				}
			}
			return mp;
		}
		else
		{
			return null;
		}
		
	}
	
	public Login add(Login l)
	{
		return mlr.save(l);
	}
}
