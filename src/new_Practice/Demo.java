package new_Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listners_Demo.class)
public class Demo 
{
	@Test
	public void myMethod()
	{
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--headless");
		WebDriver driver=new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String actual=driver.getTitle();
		String expected="Googlep";
		
		Assert.assertEquals(expected,actual,"TC failed due to Title Mismatched");
	}

}
