package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\OpenGoogle\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		WebElement l = driver
			      . findElement(By.name("username"));
			      l.sendKeys("test@gmail.com");
			      //identify password
			      WebElement p = driver
			      .findElement(By.name("password"));
			      p.sendKeys("test123");
			      WebElement b = driver
			      .findElement(By.className("Igw0E"));
			      b.click();
			      //obtain value entered for  
			      String s = l.getAttribute("value");
			      System.out.println("Value entered for username: " + s);
			      //quit browser
			     // driver.quit();
			     

		
		
		
		
		
	}

}
