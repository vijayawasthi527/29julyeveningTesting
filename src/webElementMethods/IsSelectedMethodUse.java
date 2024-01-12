package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(2000);
		
		//reference variable webelement created
		WebElement result=driver.findElement(By.xpath("//input[@value='1']"));
		Thread.sleep(2000);
		
		boolean result1 = result.isSelected();
		Thread.sleep(2000);
		
		System.out.println(result1);
		
		result.click();
		
		boolean result2 = result.isSelected();
		
		System.out.println(result2);
		
		
		
		
	
		
		
	}

}
