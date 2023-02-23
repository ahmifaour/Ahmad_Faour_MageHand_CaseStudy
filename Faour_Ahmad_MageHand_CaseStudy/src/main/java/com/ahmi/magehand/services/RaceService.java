package com.ahmi.magehand.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmi.magehand.models.Races;
import com.ahmi.magehand.repositories.RaceRepository;

@Service
public class RaceService {
	
	@Autowired
	RaceRepository rRepository;
	
	public Iterable<Races> listAll() {
		
		return rRepository.findAll();
		
	}
	
}
