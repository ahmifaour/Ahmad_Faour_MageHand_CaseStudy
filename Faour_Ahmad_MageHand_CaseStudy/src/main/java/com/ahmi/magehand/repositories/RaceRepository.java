package com.ahmi.magehand.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ahmi.magehand.models.Races;

@Repository
public interface RaceRepository extends JpaRepository <Races, Long>{
	
	public Long countByraceid(Integer rId);

}
