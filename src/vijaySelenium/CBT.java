package vijaySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBT 
{
	WebDriver driver;
	@Parameters("bname")
	@Test()
	
	public void crossbrowserTesting(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
		}
		else if(browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		
	}
	@Test()
	public void add()
	{
		System.out.println("Second Method");
	}
	
	
}
