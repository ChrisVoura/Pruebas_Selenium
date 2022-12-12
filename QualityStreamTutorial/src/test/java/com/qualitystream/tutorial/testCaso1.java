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

public class testCaso1 {
	private WebDriver driver;
	By linkredes = By.xpath("//img[@src=\"https://www.seminuevoscr.com/images/yt.svg\"]");
	By linkredes2 = By.xpath("//img[@src=\"https://www.seminuevoscr.com/images/instagram.svg\"]");   
	   @Before
	   public void setUP() {
		  
		   System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.seminuevoscr.com/");
	   }
	   @Test
	  
	   public void testCaso_1() throws InterruptedException {
		driver.findElement(linkredes).click();
		driver.findElement(linkredes2).click();
		  TimeUnit.SECONDS.sleep(5);
		  
		 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		  assertEquals("Test boton cotizar ", driver.getTitle());
	   }
	   @After 
	   public void tearDown() {
		   driver.quit();
	   }
}
