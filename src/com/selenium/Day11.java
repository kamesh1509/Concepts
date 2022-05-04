package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day11 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(Driver);
		
		WebElement mob = Driver.findElement(By.xpath("//a[text()='Mobiles']"));
		act.contextClick(mob).build().perform();
		
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement CS = Driver.findElement(By.xpath("//a[text()='Customer Service']"));
		act.contextClick(CS).build().perform();
		
		//Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement ELC = Driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		act.contextClick(ELC).build().perform();
		
		//Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		String s1 = Driver.getWindowHandle();
		System.out.println(s1);
		
		Set<String> s2 = Driver.getWindowHandles();
		System.out.println(s2);
		//for (String string : s2) {
			//String title = Driver.switchTo().window(string).getTitle();
			//System.out.println(title);
			
			for (String string2 : s2) {
				if (Driver.switchTo().window(string2).getTitle().equals("CDwindow-B547606049C7AA3EDD06F4D58AF3CEB6")) {
					break;
				}
				
				
			}
			
			
			
			
			
			
			//CDwindow-B547606049C7AA3EDD06F4D58AF3CEB6
			
			
			
			
		} 
		
		
		
		
		

	}


