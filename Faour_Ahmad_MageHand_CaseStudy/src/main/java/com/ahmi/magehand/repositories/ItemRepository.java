package com.ahmi.magehand.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ahmi.magehand.models.Items;


/**
 * 
 * Repository for the Items Model.
 *
 */

@Repository
public interface ItemRepository extends JpaRepository <Items, Long>{
	
	public Long countByiId(Integer iId);
	
}
