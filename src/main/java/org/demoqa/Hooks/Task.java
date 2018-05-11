package org.demoqa.Hooks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Task {
	WebDriver driver;
	@Given("^the user in amazon home page$")
	public void the_user_in_amazon_home_page() throws Throwable {
	 
	}

	@When("^the user search various HP laptop in search box$")
	public void the_user_search_various_HP_laptop_in_search_box() throws Throwable {
		
		WebElement fname = driver.findElement(By.name("first_name"));
		fname.sendKeys("Deepakraj");
		
		WebElement lname = driver.findElement(By.name("last_name"));
		lname.sendKeys("S");
		
	}

	@Then("^the user has to Verifing the particular Laptop added in cart or not$")
	public void the_user_has_to_Verifing_the_particular_Laptop_added_in_cart_or_not() throws Throwable {
		Assert.assertEquals("Deepakraj",driver.findElement(By.name("first_name")).getAttribute("value"));
	     Assert.assertEquals("S",driver.findElement(By.name("last_name")).getAttribute("value"));
	       
	}

}
