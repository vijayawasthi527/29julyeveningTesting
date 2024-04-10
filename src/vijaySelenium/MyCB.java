package vijaySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyCB 
{

	WebDriver driver;
	
	@Test(priority = 0)
	public void method1() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void method2() throws InterruptedException
	{
		driver=new FirefoxDriver();
		driver.get("https://www.bhaskar.com");
		Thread.sleep(2000);
	}
}
