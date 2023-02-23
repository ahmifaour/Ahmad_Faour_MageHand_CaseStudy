package com.ahmi.magehand.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmi.magehand.models.Classes;
import com.ahmi.magehand.repositories.ClassesRepository;

@Service
public class ClassesService {

	@Autowired
	ClassesRepository clRepository;
	
	public Iterable<Classes> listAll() {
		
		return clRepository.findAll();
		
	}
	
}
