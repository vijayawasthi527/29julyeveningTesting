package new_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class My_Locators 
{
	@Test
	public void locaters() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("Hello");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("kk");
	}
}
