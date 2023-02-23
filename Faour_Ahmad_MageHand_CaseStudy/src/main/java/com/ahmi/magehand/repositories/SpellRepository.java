package com.ahmi.magehand.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ahmi.magehand.models.Spells;

@Repository
public interface SpellRepository extends JpaRepository <Spells, Long>{
	
	public Long countBysId(Integer sId);

}
