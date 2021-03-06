package com.tt.test;

import java.util.HashMap;
import java.util.Iterator;
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
		//driver.get("testdata/WeightWatchers.html");
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
		
		HashMap<String,String> map1=new HashMap<String,String>();

		List<WebElement> fn = driver.findElements(By.xpath("//span[@ng-bind='food.name']"));
		//System.out.println(fn);
		List<WebElement> fs = driver.findElements(By.xpath("//span[@ng-bind='food._servingDesc']"));
		//System.out.println(fs);
		//System.out.println("Total number of food name: "+fn.size());
		//System.out.println("Total number of food serving: "+fs.size());
		
		Iterator<WebElement> iter = fn.iterator();
		Iterator<WebElement> iter1 = fs.iterator();
				
		while(iter.hasNext() && iter1.hasNext()){
			//web element of food name
			WebElement item = iter.next();
			//Retrieve the value of the web element
			String foodName = item.getText();
			//web element of 
			WebElement item1 = iter1.next();
			String foodServing = item1.getText();
			//store the values in a hash map
			map1.put(foodName, foodServing);	
		}//end of while
		System.out.println("===============================================");
		System.out.println(map1);
		System.out.println("===============================================");
			
	}//end of allFoodIntoMap

}
