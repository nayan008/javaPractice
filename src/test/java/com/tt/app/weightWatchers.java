package com.tt.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	@Test(priority=1)
	public void getThirdAndFifth(){
		String thirdItem = driver.findElement(By.xpath("//span[@ng-bind='food.name'][3]")).getText();
		String fifthItem = driver.findElement(By.xpath("//span[@ng-bind='food.name'][5]")).getText();
		System.out.println("Third Item: "+thirdItem);
		System.out.println("Fifth Item: "+fifthItem);		
	}//getThirdAndFifth
	
	@Test(priority=2)
	public void allFoodIntoMap(){
		//HashMap<String,String> map=new HashMap<String,String>();
		HashMap<List<WebElement>,List<WebElement>> map=new HashMap<List<WebElement>,List<WebElement>>();
//		String foodName = driver.findElement(By.xpath("//span[@ng-bind='food.name'][1]")).getText();
//		String foodServe = driver.findElement(By.xpath("//span[@ng-bind='food._servingDesc'][1]")).getText();
//		map.put(foodName, foodServe);

		List<WebElement> fn = driver.findElements(By.xpath("//span[@ng-bind='food.name']"));
		List<WebElement> fs = driver.findElements(By.xpath("//span[@ng-bind='food._servingDesc']"));
//		for(WebElement e : fn) {
//			  System.out.println(e.getText());
//			}
		
		
		for (Entry <List<WebElement>, List<WebElement>> entry : map.entrySet()) {
		    System.out.println("Food Name = " + entry.getKey() + ", Food Serving = " + entry.getValue());
		}
	}//end of allFoodIntoMap

}
