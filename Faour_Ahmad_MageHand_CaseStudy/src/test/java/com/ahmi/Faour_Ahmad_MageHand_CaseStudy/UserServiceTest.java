package com.ahmi.Faour_Ahmad_MageHand_CaseStudy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmi.magehand.FaourAhmadMageHandCaseStudyApplication;
import com.ahmi.magehand.models.User;
import com.ahmi.magehand.services.UserService;
import com.ahmi.magehand.repositories.UserRepository;

@SpringBootTest(classes= FaourAhmadMageHandCaseStudyApplication.class)
public class UserServiceTest {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userRepository;
	
	@Test
	public void testListAll() {
		
		User user = new User();
		user.setId(4L);
		user.setfName("Doug");
		user.setlName("Flutie");
		user.setEmail("dflutie@gmail.com");
		user.setPassword("football");
		userRepository.save(user);
		
		
		Iterable<User> result = userService.listAll();
		
		assertThat(result).isNotEmpty().hasSize(1).containsOnly(user);
		
		
	}


}
