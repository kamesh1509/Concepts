package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DAY12 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Selenium 01\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.myntra.com/men-casual-shirts");

		List<WebElement> price = Driver.findElements(
				By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		for (WebElement web : price) {
			String text = web.getText().replace("Rs. ", "");
			int parseInt = Integer.parseInt(text);
			List<Integer> product = new ArrayList<Integer>();
			product.add(parseInt);
			//System.out.println(product);
		}
		//Collections.sort(product);
		//System.out.println(product);
	
	}

}
