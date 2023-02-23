package com.ahmi.Faour_Ahmad_MageHand_CaseStudy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmi.magehand.FaourAhmadMageHandCaseStudyApplication;
import com.ahmi.magehand.models.Items;
import com.ahmi.magehand.repositories.ItemRepository;

@SpringBootTest(classes=FaourAhmadMageHandCaseStudyApplication.class)
public class ItemRepositoryTest {
	
	@Autowired
	ItemRepository itemRepository;
	
	@Test
	public void testCountByiId() {
		
		Items items = new Items();
		items.setiId(1L);
		items.setItemName("Thunderlord's Decree");
		items.setItemDesc("It is said only the Thunderlord himself can wield this weapon....");
		itemRepository.save(items);
		
		Long id = itemRepository.countByiId(1);
		assertThat(id).isEqualTo(1L);
		
	}

}
