package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Factory.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search 
{
	WebDriver driver;
	@Given("user open the application")
	public void user_open_the_application()
	{
	driver=DriverFactory.getdriver();  
	}

	@When("User enters valid product {string} into searchbox field")
	public void user_enters_valid_product_into_searchbox_field(String valid_product) {
	 
	}

	@And("user click on search button")
	public void user_click_on_search_button() {
	   
	}

	@Then("user should get valid product displayed in search results")
	public void user_should_get_valid_product_displayed_in_search_results() {
	   	}

	@And("user should get message about product matching")
	public void user_should_get_message_about_product_matching() {
	    
	}

	@When("User dont enters product name into searchbox field")
	public void user_dont_enters_product_name_into_searchbox_field() {
	
	}

	@Then("user should get message about no product matching")
	public void user_should_get_message_about_no_product_matching() {
	 
	}
	
}
