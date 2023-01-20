package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ABTesting extends BaseClass{
	
	WebDriver driver;
	public ABTesting(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//*[@class='example']//descendant::h3")
	WebElement title;

	public String verifyHeader() {
		
		return title.getText();
	}
}
