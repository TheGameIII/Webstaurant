package com.webstaurant.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webstaurant.utils.ConfigsReader;
import com.webstaurant.utils.Methods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AssignmentSteps extends Methods {
	
	//This will take us to web page
	@Given("Go to {string}")
	public void go_to(String string) throws InterruptedException {
		driver.get(ConfigsReader.getProperties("url"));
		Thread.sleep(1000);
		Assert.assertTrue("Check Website",mainpg.bannerName.isDisplayed());
		
		// driver.findElement(By.xpath("//div[@id='banner-container']/a"))
	}
	
	@When("Search for {string}")
	public void search_for(String string) {
		WebElement searchbar=driver.findElement(By.xpath("//input[@id='searchval']"));
		searchbar.sendKeys(ConfigsReader.getProperties("text"));
		WebElement searchButton=driver.findElement(By.xpath("//button[@value='Search']"));
		searchButton.click();
	}

	@Then("Check the search result ensuring every product item has the word {string} its title.")
	public void check_the_search_result_ensuring_every_product_item_has_the_word_its_title(String string) {
	    
	}

	@Then("Add the last of found items to Cart.")
	public void add_the_last_of_found_items_to_Cart() {
	   
	}

	@Then("Empty Cart.")
	public void empty_Cart() {
	    
	}

}
