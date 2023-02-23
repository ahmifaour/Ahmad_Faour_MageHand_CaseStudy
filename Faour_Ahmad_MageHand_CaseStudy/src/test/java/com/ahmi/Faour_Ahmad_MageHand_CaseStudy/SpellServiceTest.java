package com.ahmi.Faour_Ahmad_MageHand_CaseStudy;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmi.magehand.FaourAhmadMageHandCaseStudyApplication;
import com.ahmi.magehand.models.Spells;
import com.ahmi.magehand.repositories.SpellRepository;
import com.ahmi.magehand.services.SpellService;

@SpringBootTest(classes= FaourAhmadMageHandCaseStudyApplication.class)
public class SpellServiceTest {
	
	@Autowired
	SpellService spellService;
	
	@Autowired
	SpellRepository spellRepository;
	
	@Test
	public void testListAll() {
		
		Spells spells = new Spells();
		spells.setsId(1L);
		spells.setsName("Fireball");
		spells.setsLevel("3");
		spells.setsDesc("BOOM!");
		spellRepository.save(spells);
		
		Iterable<Spells> result = spellService.listAll();
		
		assertThat(result).isNotEmpty().hasSize(1).containsOnly(spells);
		
		
	}

}
