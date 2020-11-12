package com.webstaurant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deneme {
	public static void main (String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.webstaurantstore.com");
		Thread.sleep(5000);
		driver.quit();
	}

}
