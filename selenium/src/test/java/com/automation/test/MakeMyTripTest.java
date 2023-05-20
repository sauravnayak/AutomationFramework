package com.automation.test;

import static org.testng.Assert.assertNotEquals;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MakeMyTripTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/Chrome/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setBrowserName("Chrome");
		driver.manage().window().maximize();
		String url="https://www.makemytrip.com/";
		driver.get(url);
		try {
		WebDriverWait wait =new WebDriverWait(driver, 10);
		WebElement location=driver.findElement(By.xpath("//*[contains(@class,'geoSwdkajfghitcher')]"));
		wait.until(ExpectedConditions.elementToBeClickable(location));
		location.click();
		}
		catch(NoSuchElementException e ) {
			System.out.println(e.getMessage());
		}
		
		WebElement drpdownicon= driver.findElement(By.xpath("//*[contains(@class,'selectConInput')]"));
		drpdownicon.click();
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@class='listRow']"));
			boolean flag=false;
		for(WebElement a:list) {
			
			String text=a.getText();
			if(text.equals("USA")) {
				flag=true;
			}
			if(text.equals("USA")) {
				
							
				a.click();
			}
		}
		Assert.assertEquals(false,flag,"The test failed");
		
		//WebElement usa= driver.findElement(By.xpath("//*[@class='searchListWrap']//following::p[text()='USA']"));
		//usa.click();
		
		WebElement apply= driver.findElement(By.xpath("//button[text()='Apply']"));
		
		
			//(//*[@class='listRow'])[3]//span[1]
		
		
		apply.click();
		driver.quit();
		
	
	
	}

}
