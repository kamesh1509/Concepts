package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day10 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		WebElement mail = Driver.findElement(By.id("email_create"));
		mail.sendKeys("kameshrock87@gmail.com");
		WebElement clk = Driver.findElement(By.id("SubmitCreate"));
		clk.click();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement mr = Driver.findElement(By.id("id_gender1"));
		mr.click();
		WebElement name = Driver.findElement(By.id("customer_firstname"));
		name.sendKeys("kamesh");
		WebElement lastn = Driver.findElement(By.id("customer_lastname"));
		lastn.sendKeys("v");
		WebElement pass = Driver.findElement(By.id("passwd"));
		pass.sendKeys("kamesh01@");
		WebElement days = Driver.findElement(By.id("days"));
		Select s1 = new Select(days);
		s1.selectByValue("12");
		WebElement month = Driver.findElement(By.id("months"));
		Select s2 = new Select(month);
		s2.selectByValue("5");
		WebElement yoy = Driver.findElement(By.id("years"));
		Select s3 = new Select(yoy);
		s3.selectByValue("2000");
		WebElement fn = Driver.findElement(By.id("firstname"));
		fn.sendKeys("kamesh");
		WebElement last = Driver.findElement(By.id("lastname"));
		last.sendKeys("v");
		WebElement comp = Driver.findElement(By.id("company"));
		comp.sendKeys("NOTHING");
		WebElement add = Driver.findElement(By.id("address1"));
		add.sendKeys("14/44 1st st anna nagar");
		WebElement city = Driver.findElement(By.id("city"));
		city.sendKeys("chennai");
		WebElement state = Driver.findElement(By.id("id_state"));
		Select s4 = new Select(state);
		s4.selectByValue("32");
		WebElement zip = Driver.findElement(By.id("postcode"));
		zip.sendKeys("00000");
		WebElement coun = Driver.findElement(By.id("id_country"));
		Select s5 = new Select(coun);
		s5.selectByValue("21");
		WebElement pho = Driver.findElement(By.id("phone_mobile"));
		pho.sendKeys("8680056559");
		WebElement ali = Driver.findElement(By.id("alias"));
		ali.sendKeys("alias");
		WebElement clk1 = Driver.findElement(By.id("submitAccount"));
		clk1.click();
	}

}
