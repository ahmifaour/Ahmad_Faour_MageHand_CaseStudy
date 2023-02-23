package com.ahmi.Faour_Ahmad_MageHand_CaseStudy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmi.magehand.FaourAhmadMageHandCaseStudyApplication;
import com.ahmi.magehand.models.Races;
import com.ahmi.magehand.repositories.RaceRepository;
import com.ahmi.magehand.services.RaceService;

@SpringBootTest(classes= FaourAhmadMageHandCaseStudyApplication.class)
public class RaceServiceTest {
	
	@Autowired
	RaceService raceService;
	
	@Autowired
	RaceRepository raceRepository;
	
	@Test
	public void testListAll() {
		
		Races races = new Races();
		races.setRaceid(4L);
		races.setRaceName("Dwarf");
		races.setRaceBonus("+2 to Constitution");
		races.setRaceDesc("The objectively best Dungeons and Dragons Race.");
		raceRepository.save(races);
		
		Iterable<Races> result = raceService.listAll();
		
		assertThat(result).isNotEmpty().contains(races);
		
		
	}

}
