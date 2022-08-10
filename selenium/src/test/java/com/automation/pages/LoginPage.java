package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		
	}
	
	@FindBy(xpath="//*[@class='login']")
	WebElement signInLink;
	
	@FindBy(id="email") 
	WebElement emailAddress;
	
	@FindBy(name="passwd")
	WebElement pwdField;
	
	
	@FindBy(id="SubmitLogin")
	WebElement signInButton;
	
	
	public void login(String email, String password) {
		
		signInLink.click();
		emailAddress.sendKeys(email);
		pwdField.sendKeys(password);
		signInButton.click();

	}
	
	
	
	

}
