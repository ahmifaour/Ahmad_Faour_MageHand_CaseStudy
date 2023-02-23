package com.ahmi.magehand.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ahmi.magehand.models.Classes;

@Repository
public interface ClassesRepository extends JpaRepository<Classes, Long>{
	
	
	public Long countByclassId(Integer classId);
	
	

}
