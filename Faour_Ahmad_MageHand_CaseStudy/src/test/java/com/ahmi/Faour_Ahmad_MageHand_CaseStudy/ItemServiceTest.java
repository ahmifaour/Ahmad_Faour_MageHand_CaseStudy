package com.ahmi.Faour_Ahmad_MageHand_CaseStudy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmi.magehand.FaourAhmadMageHandCaseStudyApplication;
import com.ahmi.magehand.models.Items;
import com.ahmi.magehand.repositories.ItemRepository;
import com.ahmi.magehand.services.ItemService;

@SpringBootTest(classes= FaourAhmadMageHandCaseStudyApplication.class)
public class ItemServiceTest {
	
	@Autowired
	ItemService itemService;
	
	@Autowired
	ItemRepository itemRepository;
	
	@Test
	public void testListAll() {
		
		Items items = new Items();
		items.setiId(4L);
		items.setItemName("Skypiercer");
		items.setItemDesc("The weapon of the mighty Lu Bu");
		itemRepository.save(items);
		
		
		Iterable<Items> result = itemService.listAll();
		
		assertThat(result).isNotEmpty().contains(items);
		
		
	}

}
