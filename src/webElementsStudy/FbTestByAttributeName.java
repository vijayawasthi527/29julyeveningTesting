package webElementsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTestByAttributeName {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//driver.close();
		
		//xpath by attribute
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("I am the Taster");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Enjoy My Password");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		

	}

}
