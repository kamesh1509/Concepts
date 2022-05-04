package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day08 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demoqa.com/buttons");
		
		Actions act = new Actions(Driver);
		
		//WebElement dt = Driver.findElement(By.xpath("//h3[text()='Life at Amazon India']"));
		//act.moveToElement(dt).build().perform();
		
		WebElement dc = Driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(dc).build().perform();
		
		WebElement rc = Driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rc).build().perform();
		
		WebElement clk = Driver.findElement(By.id("fMyxt"));
		act.click(clk).build().perform();
	}

}
