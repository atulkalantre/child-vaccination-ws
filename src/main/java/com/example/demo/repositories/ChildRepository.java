package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Child;
import com.example.demo.entities.Parent;
@Repository
public interface ChildRepository extends JpaRepository<Child, Integer> {
	
	@Query("select c from Child c where c.parentid = :parentid")
	public List<Child> getAllChild(Parent parentid);
	
	/*@Query("select c from Child c where c.parentid = :parentid and cfname= :cfname")
	public List<Child> getChild(Parent parentid);*/
	
}
