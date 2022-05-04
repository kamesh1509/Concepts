package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://adactinhotelapp.com/index.php");
		
		WebElement user = Driver.findElement(By.id("username"));
		user.sendKeys("kamesh1509bl");
		WebElement pass = Driver.findElement(By.id("password"));
		pass.sendKeys("8680056559");
		WebElement login = Driver.findElement(By.id("login"));
		login.click();
		
		Actions act = new Actions(Driver);
		WebElement d1 = Driver.findElement(By.id("location"));
		Select s = new Select(d1);
		s.selectByVisibleText("New York");
		
		WebElement d2 = Driver.findElement(By.id("hotels"));
		Select s1 = new Select(d2);
		s1.selectByVisibleText("Hotel Sunshine");
		
		WebElement d3 = Driver.findElement(By.id("room_type"));
		Select s2 = new Select(d3);
        s2.selectByVisibleText("Standard");
        
        WebElement d4 = Driver.findElement(By.id("room_nos"));
        Select s3 = new Select(d4);
        s3.selectByValue("1");
        
        WebElement d5 = Driver.findElement(By.id("child_room"));
        Select s4 = new Select(d5);
        s4.selectByValue("1");
        
        Thread.sleep(3000);
        WebElement clk = Driver.findElement(By.id("Submit"));
        clk.click();
        
        WebElement click = Driver.findElement(By.id("radiobutton_0"));
        click.click();
        
        WebElement con = Driver.findElement(By.id("continue"));
        con.click();
        
        WebElement fn = Driver.findElement(By.id("first_name"));
        fn.sendKeys("kamesh");
        
        WebElement ln = Driver.findElement(By.id("last_name"));
        ln.sendKeys("v");
        
        WebElement add = Driver.findElement(By.name("address"));
        add.sendKeys("chennai");
        
        WebElement card = Driver.findElement(By.id("cc_num"));
        card.sendKeys("1234567891234567");
        
        WebElement cctype = Driver.findElement(By.id("cc_type"));
        Select s5 = new Select(cctype); 
        s5.selectByVisibleText("VISA");
        
        WebElement expmon = Driver.findElement(By.id("cc_exp_month"));
        Select s6 = new Select(expmon); 
        s6.selectByValue("5");
        
        WebElement expyoy = Driver.findElement(By.id("cc_exp_year"));
        Select s7 = new Select(expyoy); 
        s7.selectByValue("2016");
        
        WebElement cvv = Driver.findElement(By.id("cc_cvv"));
        cvv.sendKeys("1234");
        
        WebElement ck = Driver.findElement(By.id("book_now"));
        ck.click();
        
        //WebElement log = Driver.findElement(By.xpath("//input[@type = 'button' ][3]"));
        //Thread.sleep(3000);
       // log.clear();
        //act.contextClick(log).build().perform();
        WebElement log1 = Driver.findElement(By.xpath("//a[text() = 'Logout' ]"));
        log1.click();
        
        
	}

}
