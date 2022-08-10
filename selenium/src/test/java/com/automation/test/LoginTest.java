package com.automation.test;


import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;

public class LoginTest extends BaseClass {
	
	
	@Test
	public void launchTest() throws Exception {
		
		
		LoginPage launchpage = PageFactory.initElements(driver, LoginPage.class);
		launchpage.login(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

	}

}
