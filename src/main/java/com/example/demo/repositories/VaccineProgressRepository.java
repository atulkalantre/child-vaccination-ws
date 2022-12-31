package com.example.demo.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Child;
import com.example.demo.entities.Hospital;
import com.example.demo.entities.Parent;
import com.example.demo.entities.Vaccine;
import com.example.demo.entities.VaccineProgress;
@Repository
public interface VaccineProgressRepository extends JpaRepository<VaccineProgress, Integer> {

	@Query("select v from VaccineProgress v where v.childid= :childid")
	public List<VaccineProgress> getChildInfo(int childid);
	
	@Query(value="insert into VaccineProgress (childid,vaccineid,hospid,parentid,expdate,actualdate,status,price) VALUES(:cid,:vid,:hid,:pid,:edate,:adate,:status,:price)", nativeQuery=true)
	@Modifying
	public VaccineProgress saveInfo(Child cid,Vaccine vid,Hospital hid,Parent pid,String edate,String adate,String status,float price);

}
