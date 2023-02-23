package com.ahmi.Faour_Ahmad_MageHand_CaseStudy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmi.magehand.FaourAhmadMageHandCaseStudyApplication;
import com.ahmi.magehand.models.CharacterSheets;
import com.ahmi.magehand.services.CharacterSheetsService;
import com.ahmi.magehand.repositories.CharacterSheetRepository;

@SpringBootTest(classes= FaourAhmadMageHandCaseStudyApplication.class)
public class CharacterSheetsServiceTest {
	
	@Autowired
	CharacterSheetsService charSheetService;
	
	@Autowired
	CharacterSheetRepository charSheetRepository;
	
	@Test
	public void testListAll() {
		
		CharacterSheets characterSheets = new CharacterSheets();
		
		characterSheets.setCsId(11L);
		characterSheets.setcName("Tim");
		characterSheets.setcClass("Paladin");
		characterSheets.setcRace("Dragonborn");
		characterSheets.setcScores("Test");
		characterSheets.setcItems("6 Gold Pieces");
		characterSheets.setcSpells("Lay-on-hands");
		
		charSheetRepository.save(characterSheets);
		
		Iterable<CharacterSheets> result = charSheetService.listAll();
		
		assertThat(result).isNotEmpty().contains(characterSheets);
		
		
	}

}
