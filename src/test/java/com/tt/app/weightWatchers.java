package com.tt.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class weightWatchers {
	WebDriver driver;
	
	@BeforeTest
	public void launchWeb(){
		driver = new FirefoxDriver();
		driver.get("file:///Users/mahbubsiddique/Documents/WeightWatchers.html");
	}
	@AfterTest
	public void closeWeb(){
		driver.close();
	}
	
	@Test
	public void getThirdAndFifth(){
		String thirdItem = driver.findElement(By.xpath("//span[@ng-bind='food.name'][3]")).getText();
		String fifthItem = driver.findElement(By.xpath("//span[@ng-bind='food.name'][5]")).getText();
		System.out.println("Third Item: "+thirdItem);
		System.out.println("Fifth Item: "+fifthItem);		
	}

}
