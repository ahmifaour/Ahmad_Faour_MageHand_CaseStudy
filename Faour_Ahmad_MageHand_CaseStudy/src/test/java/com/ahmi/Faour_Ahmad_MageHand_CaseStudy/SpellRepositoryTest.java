package com.ahmi.Faour_Ahmad_MageHand_CaseStudy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmi.magehand.FaourAhmadMageHandCaseStudyApplication;
import com.ahmi.magehand.models.Spells;
import com.ahmi.magehand.repositories.SpellRepository;

@SpringBootTest(classes = FaourAhmadMageHandCaseStudyApplication.class)
public class SpellRepositoryTest {

	@Autowired
	private SpellRepository spellRepository;

	@Test
	public void testCountBysId() {
		Spells spells = new Spells();
		spells.setsId(1L);
		spells.setsName("Fireball");
		spells.setsLevel("3");
		spells.setsDesc("Flames!");
		spellRepository.save(spells);

		Long id = spellRepository.countBysId(1);
		assertThat(id).isEqualTo(1);
	}

}
