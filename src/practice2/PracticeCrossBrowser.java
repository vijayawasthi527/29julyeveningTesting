package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeCrossBrowser {
	@Parameters("bName")
	
	@Test
  public void CBTesting(String browsername) throws InterruptedException
	{
			WebDriver driver=null;
			if(browsername.equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(browsername.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(browsername.equals("edge"))
			{
				driver=new EdgeDriver();
			}
			
			driver.get("https://www.facebook.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("email")).sendKeys("vijay@testmail.com");
			driver.findElement(By.id("pass")).sendKeys("Test@123");
			Thread.sleep(2000);
			driver.findElement(By.name("login")).click();
	}
}
