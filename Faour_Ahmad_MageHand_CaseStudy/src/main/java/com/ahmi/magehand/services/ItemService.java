package com.ahmi.magehand.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmi.magehand.models.Items;
import com.ahmi.magehand.repositories.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	ItemRepository iRepository;
	
	public Iterable<Items> listAll() {
		
		return iRepository.findAll();
		
	}

}
