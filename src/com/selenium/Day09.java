package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day09 {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.primevideo.com/?ref_=dvm_pds_amz_in_as_s_g_146_mkw_slgAX6a65-dc&mrntrk=pcrid_386559716631_slid__pgrid_82649959367_pgeo_1007809_x__ptid_kwd-303629226711");
		
		Actions act = new Actions(Driver);
		WebElement clk = Driver.findElement(By.xpath("//button[@type='submit']"));
		act.contextClick(clk).build().perform();
		
		Robot rob = new Robot();
	
		rob.keyPress(KeyEvent.VK_UP );
		rob.keyRelease(KeyEvent.VK_UP);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyPress(KeyEvent.VK_ENTER);
		
		 
	}
}
