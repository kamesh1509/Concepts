package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day07 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("http://demo.automationtesting.in/Frames.html");
		Driver.manage().window().maximize();
		
		int size = Driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		//WebElement s1 = Driver.findElement(By.id("singleframe"));
		Driver.switchTo().frame(0);
		
		WebElement s2 = Driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		s2.sendKeys("hello");
		
		Driver.switchTo().defaultContent();
		
		WebElement f1 = Driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		f1.click();
		
		Driver.switchTo().frame(1);
		Driver.switchTo().frame(0);
		
		WebElement f2 = Driver.findElement(By.xpath("//input[@type='text']"));
		f2.sendKeys("Games");
		
		
		
		
		
		
	}
}
