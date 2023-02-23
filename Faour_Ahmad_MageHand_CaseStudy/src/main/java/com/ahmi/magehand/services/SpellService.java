package com.ahmi.magehand.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmi.magehand.models.Spells;
import com.ahmi.magehand.repositories.SpellRepository;

@Service
public class SpellService {
	
	@Autowired
	SpellRepository sRepository;
	
	public Iterable<Spells> listAll() {
		
		return sRepository.findAll();
		
	}

}
