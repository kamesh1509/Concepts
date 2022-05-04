package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://jqueryui.com/droppable/");
		
		Driver.switchTo().frame(0);
		WebElement a1 = Driver.findElement(By.id("draggable"));
		WebElement a2 = Driver.findElement(By.id("droppable"));
		
		Actions ac = new Actions(Driver);
		ac.dragAndDrop(a1, a2).build().perform();
		
		
		
	}

}
