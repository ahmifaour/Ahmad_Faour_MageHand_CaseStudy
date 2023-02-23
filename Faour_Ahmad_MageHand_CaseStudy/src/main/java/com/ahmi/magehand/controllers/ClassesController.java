package com.ahmi.magehand.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ahmi.magehand.models.Classes;
import com.ahmi.magehand.services.ClassesService;

/**
 * 
 * Controller for the "classes.html" webpage.
 *
 */

@Controller
public class ClassesController {
	
	@Autowired
	ClassesService classesService;
	
	@GetMapping("/classes")
	public String classes(Model model) {
		
		Iterable<Classes> listClasses = classesService.listAll();
		model.addAttribute("listClasses", listClasses);
		
		return "classes";
		
	}

}
