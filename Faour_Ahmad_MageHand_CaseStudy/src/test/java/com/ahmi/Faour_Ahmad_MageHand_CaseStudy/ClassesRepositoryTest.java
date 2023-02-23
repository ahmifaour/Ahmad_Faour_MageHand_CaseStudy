package com.ahmi.Faour_Ahmad_MageHand_CaseStudy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmi.magehand.FaourAhmadMageHandCaseStudyApplication;
import com.ahmi.magehand.models.Classes;
import com.ahmi.magehand.repositories.ClassesRepository;

@SpringBootTest(classes= FaourAhmadMageHandCaseStudyApplication.class)
public class ClassesRepositoryTest {
	
	@Autowired
	private ClassesRepository classesRepository;
	
	@Test
	public void testCountByclassId() {
		
		Classes classes = new Classes();
		classes.setClassId(1);
		classes.setClassName("Technomancer");
		classes.setClassDesc("Coders from a distant future...");
		classesRepository.save(classes);
		
		Long id = classesRepository.countByclassId(1);
		assertThat(id).isEqualTo(1L);
		
	}

}
