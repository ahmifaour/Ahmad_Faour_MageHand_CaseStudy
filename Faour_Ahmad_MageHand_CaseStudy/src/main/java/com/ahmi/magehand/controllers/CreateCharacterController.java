package com.ahmi.magehand.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ahmi.magehand.exceptions.CharacterNotExistException;
import com.ahmi.magehand.models.CharacterSheets;
import com.ahmi.magehand.services.CharacterSheetsService;

@Controller
public class CreateCharacterController {

	@Autowired
	private CharacterSheetsService charSheetsService;
	
	@GetMapping("/createcharacter")
	public String displayNewForm(Model model) {
		
		model.addAttribute("character", new CharacterSheets());
		
		return "createcharacter";
		
	}
	
	@GetMapping("/createcharacter/delete/{csId}")
	public String deleteCharacter(@PathVariable("csId") Long csId, RedirectAttributes rAttributes) {
		
		try {
			
			charSheetsService.deleteCharacter(csId);
			rAttributes.addFlashAttribute("message", "The character with an ID of: " + csId + " has been lost to the Underdark...(deleted)");
			
		}catch (CharacterNotExistException exception) {
			
			rAttributes.addFlashAttribute("message", exception.getMessage());
			
		}
		
		return "redirect:/index";
		
	}
	
	@PostMapping("/createcharacter/save")
	public String saveNewCharacter(CharacterSheets characterSheets, RedirectAttributes rAttributes) {
		
		charSheetsService.saveCharacter(characterSheets);
		rAttributes.addFlashAttribute("message", "Congratualtions! You have successfully created your character. Best wishes to you!");
		return "redirect:/charactersheets";
		
	}
	
}
