package stepdefinations;

//import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Factory.DriverFactory;

import io.cucumber.java.*;
import io.cucumber.java.en.*;
import junit.framework.Assert;



public class login 
{
	WebDriver driver;
@ Given("user has navigated to login page")
	public void user_has_navigated_to_login_page()
	{  
	
	    driver=DriverFactory.getdriver();
		driver.findElement(By.xpath("//span[text()=\"My Account\"]")).click();
		driver.findElement(By.linkText("Login")).click();
	}
 
   @When("user enter valid email address {string} into email field")
   public void user_enter_valid_email_address_into_email_field(String email)
   {
   driver.findElement(By.id("input-email")).sendKeys(email);   
   }

   @When("user enter valid password {string} into password field")
   public void user_enter_valid_password_into_password_field(String pwd)
   {
   driver.findElement(By.id("input-password")).sendKeys(pwd);   
   }

   @And("user click on login button")
   public void user_click_on_login_button() 
   {
    driver.findElement(By.xpath("//input[@value=\"Login\"]")).click(); 
    
   }

   @Then("user should get sucessfully login")
   public void user_should_get_sucessfully_login()
   {
	     Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
   }
   @When("user enter email address {string} into password field")
   public void user_enter_invalid_email_address_into_password_field(String invalidemail)
   {
	   driver.findElement(By.id("input-email")).sendKeys(invalidemail); 
   }

   @When("user enter invalid password {string} into password field")
   public void user_enter_invalid_password_into_password_field(String invalidpwd)
   {
	   driver.findElement(By.id("input-password")).sendKeys(invalidpwd); 
   }

   @Then("user should get proper error message about credentials mismatch")
   public void user_should_get_proper_error_message_about_credentials_mismatch()
   {
   Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger alert')]")).getText().contains("No match for E-Mail Address and/or Password."));
   }
   
   @When("user enter invalid email address {string} into email field")
   public void user_enter_invalid_email_address_into_email_field(String email) {
	   driver.findElement(By.id("input-email")).sendKeys(email);
   }

   @Given("user has navigated to login page into email field")
   public void user_has_navigated_to_login_page_into_email_field() {
	   driver=DriverFactory.getdriver();
	 		driver.findElement(By.xpath("//span[text()=\"My Account\"]")).click();
	 		driver.findElement(By.linkText("Login")).click();
   }

   @Given("user enter invalid password into password field")
   public void user_enter_invalid_password_into_password_field() {
	   driver.findElement(By.id("input-password"));
   }
}
