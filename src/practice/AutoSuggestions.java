package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AutoSuggestions 
{
	@Test
	public void autosuggestions() throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Honda");
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(@class,'sbct PZPZlf')]"));
		for(WebElement ll:list)
		{
			String finalResult=ll.getText();
			System.out.println(finalResult);
			
			if (finalResult.equalsIgnoreCase("honda city"))
			{
				ll.click();
				System.out.println("Clicked on "+finalResult);
				break;
				
			}
			
		}
		
		
			
		
	
		
		
	}
}
