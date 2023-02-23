package com.ahmi.Faour_Ahmad_MageHand_CaseStudy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmi.magehand.FaourAhmadMageHandCaseStudyApplication;
import com.ahmi.magehand.models.User;
import com.ahmi.magehand.repositories.UserRepository;

@SpringBootTest(classes = FaourAhmadMageHandCaseStudyApplication.class)
public class UserRepositoryTest {
	
	 @Autowired
	    private UserRepository userRepository;

	 @Test
	    public void testCountById() {
	        User user = new User();
	        user.setId(1L);
	        user.setfName("John");
	        user.setlName("Smith");
	        user.setEmail("jsmith@gmail.com");
	        user.setPassword("hello");
	        userRepository.save(user);

	        Long id = userRepository.countById(1);
	        assertThat(id).isEqualTo(1L);
	    }
	}
