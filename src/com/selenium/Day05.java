package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day05 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement ss = driver.findElement(By.id("dropdown1"));
		ss.click();
		
		Select s = new Select(ss);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		//s.selectByValu("Selenieum)";
		
	
		
		
	}

}
