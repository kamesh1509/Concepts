package com.selenium;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03 {
	
	public static void main(String[] args) throws InterruptedException, Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(3000);
		
		WebElement id = driver.findElement(By.name("username"));
		id.sendKeys("kamesh");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("123456");
		
		WebElement log = driver.findElement(By.xpath("//button[@type = 'submit' ]"));
		log.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File aa = ts.getScreenshotAs(OutputType.FILE);
		File bb = new File("C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Pics\\snap.png");
		
		FileUtils.copyFile(aa, bb);
		
		driver.close();
		
	}

}
