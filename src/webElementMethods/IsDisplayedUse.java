package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("hide-textbox")).click();
		
		Thread.sleep(2000);
		
		boolean result = driver.findElement(By.id("displayed-text")).isDisplayed();
		
		System.out.println("Displayed Text is :- "+result);
		
		Thread.sleep(2000);
		
		//driver.findElement(By.name("show-hide")).sendKeys("Hello User");
		//above line will not print the text in box because , box is not displayed or hide itself

	}

}
