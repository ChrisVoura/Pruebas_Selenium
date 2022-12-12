package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;

 
public class testCotizar {
   private WebDriver driver;
   By linkSucursales = By.linkText("SUCURSALES");
   By SelecciónS = By.linkText("Seminuevos Belén");
   
   @Before
   public void setUP() {
	  
	   System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.seminuevoscr.com/");
   }
   @Test
  
   public void testCaso2() throws InterruptedException {
	driver.findElement(linkSucursales).click();
	driver.findElement(SelecciónS).click();

	  TimeUnit.SECONDS.sleep(10);
	  
	 
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	  assertEquals("Test boton cotizar ", driver.getTitle());
   }
   @After
   public void tearDown() {
	   driver.quit();
   }
}
