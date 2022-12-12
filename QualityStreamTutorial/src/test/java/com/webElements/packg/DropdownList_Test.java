package com.webElements.packg;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownList_Test {
    private WebDriver driver;
    testCaso5 ddlPage;
	
    @Before
    public void setUp() throws Exception {
    	 ddlPage = new  testCaso5(driver);
    	 driver=  ddlPage.chromeDriverConnection();
    	 driver.manage().window().maximize();
    }
    @ After
     public void tearDown() throws Exception {
    //	 driver.quit();
    }
    
    @Test
	public void test_classic_DDL() throws InterruptedException {
	 ddlPage.visit("https://www.seminuevoscr.com/");
	 assertEquals(ddlPage.testlista_1(),"SABANA NORTE");
	
    
	}
    
    

}
