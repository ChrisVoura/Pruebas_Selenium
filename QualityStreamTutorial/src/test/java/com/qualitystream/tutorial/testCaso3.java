package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCaso3 {
	private WebDriver driver;
	
	   @Before
	   public void setUP() {
		  
		   System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.seminuevoscr.com/");
	   }
	   @Test
	  
	   public void testCaso_1() throws InterruptedException {
		   WebElement imgCarrusel = driver.findElement(By.xpath("//input[ @class =\"btn-banner\" and contains(@onclick, 'https://www.seminuevoscr.com/item/80955')]"));
		   imgCarrusel.click(); 
		   TimeUnit.SECONDS.sleep(10);
		  
		 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		  assertEquals("Test mover carrusel ", driver.getTitle());
	   }
	   @After
	   public void tearDown() {
		  // driver.quit();
	   }
} 
