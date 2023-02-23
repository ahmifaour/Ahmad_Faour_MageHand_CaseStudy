package com.ahmi.magehand.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ahmi.magehand.models.Races;
import com.ahmi.magehand.services.RaceService;

/**
 * 
 * Controller for the "races.html" webpage.
 *
 */

@Controller
public class RacesController {
	
	@Autowired
	RaceService raceService;
	
	@GetMapping("/races")
	public String races(Model model) {
		
		Iterable<Races> listRaces = raceService.listAll();
		model.addAttribute("listRaces", listRaces);

		return "races";

	}
	
}
