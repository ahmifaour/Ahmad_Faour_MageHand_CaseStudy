package com.ahmi.Faour_Ahmad_MageHand_CaseStudy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmi.magehand.FaourAhmadMageHandCaseStudyApplication;
import com.ahmi.magehand.models.Races;
import com.ahmi.magehand.repositories.RaceRepository;

@SpringBootTest(classes=FaourAhmadMageHandCaseStudyApplication.class)
public class RaceRepositoryTest {
	
	@Autowired
	private RaceRepository raceRepository;
	
	@Test
	public void testCountByraceId() {
		
		Races races = new Races();
		races.setRaceid(1L);
		races.setRaceName("Human");
		races.setRaceBonus("+1 to Silliness");
		races.setRaceDesc("Silly Billies");
		raceRepository.save(races);
		
		Long id = raceRepository.countByraceid(1);
		assertThat(id).isEqualTo(1L);
		
	}

}
