package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Form {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demoqa.com/automation-practice-form");
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement firt = Driver.findElement(By.id("firstName"));
		firt.sendKeys("kamesh");
		
		WebElement last = Driver.findElement(By.id("lastName"));
		last.sendKeys("v");
		
		WebElement mail = Driver.findElement(By.id("userEmail"));
		mail.sendKeys("kamesh@gmail.com");
		
		WebElement gen = Driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		gen.click();
		
		WebElement mob = Driver.findElement(By.id("userNumber"));
		mob.sendKeys("1345655604");
		
		WebElement dob = Driver.findElement(By.id("dateOfBirthInput"));
		dob.click();
		
	    WebElement mon = Driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select s1 = new Select(mon);
		s1.selectByVisibleText("December");
		
		WebElement yoy = Driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select s2 = new Select(yoy);
		s2.selectByValue("2012");
		
		WebElement date = Driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]"));
		date.click();
		
		
		Actions act = new Actions(Driver);
		WebElement sub = Driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
		act.contextClick(sub);
		//sub.sendKeys("eng");
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		
		
		WebElement box = Driver.findElement(By.xpath("(//label[@for='hobbies-checkbox-1'])"));
		box.click();
		
		WebElement box2 = Driver.findElement(By.xpath("(//label[@for='hobbies-checkbox-2'])"));
		box2.click();
		
		
	}

}
