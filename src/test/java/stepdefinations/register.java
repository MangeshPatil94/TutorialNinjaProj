package stepdefinations;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register {
WebDriver driver;
	@Given("user has navigated to Register Account page")
	public void user_has_navigated_to_register_account_page() 
	{
     driver=DriverFactory.getdriver();
     driver.findElement(By.xpath("//span[text()='My Account']")).click();
     driver.findElement(By.linkText("Register")).click();
	}

	@When("user enter the below fields")
	public void user_enter_the_below_fields(DataTable dataTable)
	{
		Map<String, String> datamap = dataTable.asMap(String.class,String.class) ; 
	    driver.findElement(By.id("input-firstname")).sendKeys(datamap.get("firstName"));
	    driver.findElement(By.id("input-lastname")).sendKeys(datamap.get("lastname"));
	    driver.findElement(By.id("input-email")).sendKeys(datamap.get("email"));
	    driver.findElement(By.id("input-telephone")).sendKeys(datamap.get("telephone"));
	    driver.findElement(By.id("input-password")).sendKeys(datamap.get("password"));
	    driver.findElement(By.id("input-confirm")).sendKeys(datamap.get("password"));
	}

	@When("user select Privacy policy")
	public void user_select_privacy_policy() {
		driver.findElement(By.name("agree")).click();;
		 
	}

	@When("user click on continiue button")
	public void user_click_on_continiue_button() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();;
	}

	@Then("user account should get creaed sucessfully")
	public void user_account_should_get_creaed_sucessfully() 
	{
	Assert.assertEquals("Your Account Has Been Created!", driver.findElement(By.xpath("//div[@id='content']/h1")).getText());
	}

	@When("user select yes for New Account")
	public void user_select_yes_for_new_account() 
	{
	driver.findElement(By.xpath("//input[@name=\"newsletter\"][@value=\"1\"]")).click();  
	}

	@Then("user account should get proper warning about duplicate email")
	public void user_account_should_get_proper_warning_about_duplicate_email()
	{
     Assert.assertTrue(driver.findElement(By.xpath("class=\"alert alert-danger alert-dismissible\"")).getText().contains("Warning: E-Mail Address is already registered!"));
	}

	@When("user dont enter any details into fields")
	public void user_dont_enter_any_details_into_fields() {
	  //intentially kept blank
	}

	@Then("user should get proper warning message to every field")
	public void user_should_get_proper_warning_message_to_every_field() 
	{
		 Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,\"alert alert-danger alert-dismissible\")]")).getText().contains("Warning: You must agree to the Privacy Policy!"));
				
		 Assert.assertEquals("First Name must be between 1 and 32 characters!", driver.findElement(By.xpath("(//div[@class=\\\"text-danger\\\"])[1]")).getText());
		 Assert.assertEquals("Last Name must be between 1 and 32 characters!", driver.findElement(By.xpath("(//div[@class=\\\"text-danger\\\"])[2]")).getText());
		 Assert.assertEquals("E-Mail Address does not appear to be valid!", driver.findElement(By.xpath("(//div[@class=\\\"text-danger\\\"])[3]")).getText());
		 Assert.assertEquals("Telephone must be between 3 and 32 characters!!", driver.findElement(By.xpath("(//div[@class=\\\"text-danger\\\"])[4]")).getText());
		 Assert.assertEquals("Password must be between 4 and 20 characters!", driver.findElement(By.xpath("(//div[@class=\\\"text-danger\\\"])[5]")).getText());
			
	}
	
}
