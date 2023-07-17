package initilise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks 
{
	WebDriver driver;
	@Before
	public void setup()
	{
		DriverFactory.initilisebrowser("firefox");
		driver=DriverFactory.getdriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo");
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
