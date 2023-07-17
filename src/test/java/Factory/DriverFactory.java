package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory 
{
	static WebDriver driver=null;
public static void initilisebrowser(String browserName)
{
	
	if(browserName.equals("firefox"))
	{
		 driver=new FirefoxDriver();
	}
	else if(browserName.equals("firefox"))
	{
		 driver=new ChromeDriver();
	}
}

public static WebDriver getdriver() {
	// TODO Auto-generated method stub
	return driver;
}



	
}

