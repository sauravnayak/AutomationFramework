package com.automation.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.HomePage;

public class HomeTest extends BaseClass {
	
	
	@Test
	public void launchTest() throws Exception {
		
		
		HomePage launchpage = PageFactory.initElements(driver, HomePage.class);
		String title= driver.getTitle();
		String expectedTitle= "The Internet";
		launchpage.clickABTest();
		Thread.sleep(5000);
		Assert.assertEquals(title, expectedTitle); 
		
		//launchpage.login(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

	}
	


}
