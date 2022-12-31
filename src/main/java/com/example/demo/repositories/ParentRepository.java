package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;
import com.example.demo.entities.Parent;
import com.example.demo.entities.ParentRegister;
@Repository
public interface ParentRepository extends JpaRepository<Parent, Integer> {
	@Query("select p from Parent p where p.loginid=:loginid")
	Optional<Parent> GetParent(Login loginid);
	
	@Query("select p from Parent p where aadharno = :aadharno")
	public Parent getParent(long aadharno);
	
	@Query(value="select p from Parent p inner join Login l on p.loginid=l.loginid;",nativeQuery=true)
	public List<ParentRegister> getAllParent();
	
}
