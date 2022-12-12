package com.webElements.packg;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.project.pom.Base;

public class testCaso5 extends Base{
	
	public testCaso5(WebDriver driver) {
		super(driver);
	}

	private WebDriver driver;
	By dropdownListS = By.id("suc");
	By dropdownListM = By.id("marca");
	By search= By.cssSelector("input#btn_search:first-child");
			    
	 public String  testlista_1() throws InterruptedException {
		 Select selectlist= new Select(findElement(dropdownListS));
		 selectlist.selectByVisibleText("SABANA NORTE");
		 Select selectlist2= new Select(findElement(dropdownListM));
		 selectlist2.selectByVisibleText("TOYOTA");
		 TimeUnit.SECONDS.sleep(5);
		 click(search);
		
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 return getText(selectlist.getFirstSelectedOption(),selectlist2.getFirstSelectedOption());
	 }
	  
	
	
}
