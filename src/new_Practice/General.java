package new_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class General
{
	@Parameters("bname")
	@Test
	public void CrossBrowser(String browserName)
	{
		WebDriver driver;
		
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
		}
		
		else if(browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.google.com");
		}
		
		else
		{
			driver=new EdgeDriver();
			driver.get("https://www.google.com");
		}
		
	}

}
