package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day06_Alert {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement click = Driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		click.click();
		
		Driver.switchTo().alert().accept();
		
		WebElement cc = Driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		cc.click();
		
		Driver.switchTo().alert().accept();
		
		Driver.get("https://demoqa.com/alerts");
		
		WebElement promp = Driver.findElement(By.id("promtButton"));
		promp.click();
		
		Driver.switchTo().alert().sendKeys("kamesh");
		Driver.switchTo().alert().accept();
		
	
	}

}
