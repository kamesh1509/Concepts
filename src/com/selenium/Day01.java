package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\OpenGoogle\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tesla.com/");
		
		driver.navigate().to("https://www.spacex.com/");
		
		driver.get("https://www.wwe.com/");
		
		driver.navigate().to("https://www.primevideo.com/?ref_=dvm_pds_amz_in_as_s_g_146_mkw_slgAX6a65-dc&mrntrk=pcrid_423192672131_slid__pgrid_82649959367_pgeo_1007809_x__ptid_kwd-303629226711");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.get("https://www.netflix.com/in/");
		
		driver.navigate().refresh();
		
		driver.close();
	}

}