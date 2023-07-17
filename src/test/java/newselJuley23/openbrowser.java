package newselJuley23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openbrowser 
{
public static void main(String[] args) 
{
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\MavenBDDcucumber\\TutorialsNinjaProj\\browser\\chromedriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	
}	


}
