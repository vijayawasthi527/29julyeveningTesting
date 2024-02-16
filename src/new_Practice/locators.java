package new_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("hello");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
