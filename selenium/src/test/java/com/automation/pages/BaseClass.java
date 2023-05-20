package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utility.BrowserFactory;
import com.automation.utility.ConfigReader;
import com.automation.utility.ExcelDataProvider;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigReader config;
	
	
	@BeforeSuite
	public void setSuite() {
		excel=new ExcelDataProvider();
		config= new ConfigReader();

	}
	@BeforeClass
	public void setUp() {

		this.driver = BrowserFactory.startApplication(config.getBrowser(), config.getURL(), driver);
		System.out.println("Application Launched ");
	}
	
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitApplication(driver);

	}
	
	
	public void ExternalWaitClick(WebElement e, WebDriver dr)
	{
		WebDriverWait wait=new WebDriverWait(dr,10);
		wait.until(ExpectedConditions.elementToBeClickable(e));
	}
	
	/*
	 * public void waitforElement(WebElement e) { WebDriverWait wait=new
	 * WebDriverWait(driver, 10);
	 * wait.until(ExpectedConditions.elementToBeClickable(e));
	 * 
	 * 
	 * }
	 */
	

}
