package com.ahmi.magehand.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ahmi.magehand.models.Spells;
import com.ahmi.magehand.services.SpellService;

/**
 * 
 * Controller handling the "spells.html" webpage.
 *
 */

@Controller
public class SpellsController {
	
	@Autowired
	SpellService spellService;
	
	@GetMapping("/spells")
	public String spells(Model model) {
		
		Iterable<Spells> listSpells = spellService.listAll();
		model.addAttribute("listSpells", listSpells);

		return "spells";

	}

}
