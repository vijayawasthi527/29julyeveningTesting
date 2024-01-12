package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	String expectedResult="Facebook helps you connect and share with the people in your life.";
	String actualResult=driver.findElement(By.className("_8eso")).getText();
	
	Thread.sleep(2000);
	System.out.println(actualResult);
	
	if(expectedResult.equals(actualResult))
	{
		System.out.println("Text is matching!!! TC passed");
	}
	else
	{
		System.out.println("Text is not matching!!! TC failed");
	}
	
	

	}

}
