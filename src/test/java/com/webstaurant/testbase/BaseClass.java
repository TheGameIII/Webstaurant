package com.webstaurant.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.webstaurant.utils.ConfigsReader;
import com.webstaurant.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void setUp() {
		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		String extension= "";
		if(Constants.OS_NAME.contains("Windows")) {
			extension=".exe";
		}
		switch(ConfigsReader.getProperties("browser").toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		default:
			System.err.println("Browser is not supported");			
		}
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIME,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(ConfigsReader.getProperties("url"));
		
	}
	
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
