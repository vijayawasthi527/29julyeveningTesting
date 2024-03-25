package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class PracticeCrossBrowsertesting
{
	WebDriver driver;
	@Parameters("browsername")
	@Test
	public void browserselect(String bname) throws InterruptedException
	{
		if(bname.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(bname.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']")).sendKeys(Keys.F5);
		
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
		
	}

}
