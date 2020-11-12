package com.webstaurant.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webstaurant.testbase.BaseClass;
import com.webstaurant.utils.ConfigsReader;
import com.webstaurant.utils.Methods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainPageElements extends Methods{
	@FindBy(xpath="//div[@id='banner-container']/a")
	public WebElement bannerName;
	
	@FindBy(xpath="//span[@class='inline-block ml-1 align-middle']/span[2]")
	public WebElement learnMore;
	
	@FindBy(xpath="//input[@id='searchval']")
	public WebElement searchbar;
	
	@FindBy(xpath="//button[@value='Search']")
	public WebElement searchButton;
	
	@FindBy(xpath="//span[@class='ml-1']")
	public WebElement chatNow;
	
	@FindBy(xpath="//a[@data-testid='cart-nav-link']")
	public WebElement cart;
	
	@FindBy(xpath="//a[@data-testid='register-nav-link']")
	public WebElement registerButton;
	
	@FindBy(xpath="//a[@data-testid='login-nav-link']")
	public WebElement loginButton;
	
	@FindBy(xpath="//div[@class='global-menu--right flex mr-0 align-baseline']/a[1]")
	public WebElement fastShip;
	
	@FindBy(xpath="//div[@id='flyout-nav']")
	public WebElement mainContainer;
	
	
	public void MainPageElements() {
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.webstaurantstore.com");
		//Assert.assertTrue("Check Website",mainpg.bannerName.isDisplayed());
		webs.searchbar.sendKeys("table");
		webs.searchButton.click();
		driver.quit();
	}
	
	
}
