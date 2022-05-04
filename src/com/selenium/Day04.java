package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day04 {
	
public static void main(String[] args) throws InterruptedException, Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		driver.manage().window().maximize();
		
		WebElement id = driver.findElement(By.name("firstname"));
		id.sendKeys("kamesh");
		
		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("v");
		
		WebElement mob = driver.findElement(By.name("reg_email__"));
		mob.sendKeys("9874561230");
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("123123123ka");
		
		WebElement dob = driver.findElement(By.name("birthday_day"));
		
		Select s = new Select(dob);
		s.selectByIndex(16);
		
		WebElement mon = driver.findElement(By.name("birthday_month"));
		Select s1= new Select(mon);
		s1.selectByVisibleText("May");
		
		WebElement yoy = driver.findElement(By.name("birthday_year"));
		Select s2= new Select(yoy);
		s2.selectByValue("2012");
		
		WebElement gen = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gen.click();
		
		WebElement log = driver.findElement(By.name("websubmit"));
		log.click();
		
		Thread.sleep(3500);
		
	    //TakesScreenshot pic = (TakesScreenshot) driver;
		//File a = pic.getScreenshotAs(OutputType.FILE);
	    //File b = new File("C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Pics\\snap1.png");
		
		//FileUtils.copyDirectory(a, b);
		

 }
}
