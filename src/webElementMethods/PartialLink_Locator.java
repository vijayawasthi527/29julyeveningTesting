package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink_Locator {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.triveniturbines.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Parts & Service")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.mponline.gov.in/portal/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("म. प्र. कर्मचारी चयन मंडल")).click();
		
		Thread.sleep(1000);
		
		
		
		
		
		

	}

}
