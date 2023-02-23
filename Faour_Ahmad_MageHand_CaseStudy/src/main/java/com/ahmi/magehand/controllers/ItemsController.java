package com.ahmi.magehand.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ahmi.magehand.models.Items;
import com.ahmi.magehand.services.ItemService;

/**
 * 
 * Controller for the "items.html" webpage.
 *
 */

@Controller
public class ItemsController {

	@Autowired
	ItemService itemService;

	@GetMapping("/items")
	public String items(Model model) {

		Iterable<Items> listItems = itemService.listAll();
		model.addAttribute("listItems", listItems);

		return "items";

	}

}
