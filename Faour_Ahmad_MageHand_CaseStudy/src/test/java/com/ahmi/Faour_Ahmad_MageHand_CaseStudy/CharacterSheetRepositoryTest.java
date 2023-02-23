package com.ahmi.Faour_Ahmad_MageHand_CaseStudy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.ahmi.magehand.FaourAhmadMageHandCaseStudyApplication;
import com.ahmi.magehand.models.CharacterSheets;
import com.ahmi.magehand.repositories.CharacterSheetRepository;

@SpringBootTest(classes=FaourAhmadMageHandCaseStudyApplication.class)
public class CharacterSheetRepositoryTest {
	
	@Autowired
	private CharacterSheetRepository csRepository;
	
	@Test
	@DirtiesContext
	public void testCountBycsId() {
		
		CharacterSheets charSheets = new CharacterSheets();
		charSheets.setCsId(10L);
		charSheets.setcName("Aragorn");
		charSheets.setcClass("Ranger");
		charSheets.setcRace("Human");
		charSheets.setcScores("Test");
		charSheets.setcItems("Test");
		charSheets.setcSpells("Test");
		csRepository.save(charSheets);
		
		Long id = csRepository.countBycsId(10L);
		assertThat(id).isEqualTo(10L);
		
		
	}

}
