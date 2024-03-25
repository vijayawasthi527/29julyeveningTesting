package vijaySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class practiceCB
{
	
	WebDriver driver;
	@Parameters("bname")
	@Test
	public void mytest(String browsername) throws InterruptedException
	{
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(20000);
		driver.close();
	}
}
