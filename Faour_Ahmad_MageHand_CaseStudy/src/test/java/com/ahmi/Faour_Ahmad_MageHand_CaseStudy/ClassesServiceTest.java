package com.ahmi.Faour_Ahmad_MageHand_CaseStudy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmi.magehand.FaourAhmadMageHandCaseStudyApplication;
import com.ahmi.magehand.models.Classes;
import com.ahmi.magehand.repositories.ClassesRepository;
import com.ahmi.magehand.services.ClassesService;

@SpringBootTest(classes= FaourAhmadMageHandCaseStudyApplication.class)
public class ClassesServiceTest {
	
	@Autowired
	ClassesService classesService;
	
	@Autowired
	ClassesRepository classesRepository;
	
	@Test
	public void testListAll() {
		
		Classes classes = new Classes();
		classes.setClassId(3);
		classes.setClassName("Beatboxer");
		classes.setClassDesc("Bard with a twist.");
		classesRepository.save(classes);
		
		Iterable<Classes> result = classesService.listAll();
		
		assertThat(result).isNotEmpty().contains(classes);
		
		
	}

}