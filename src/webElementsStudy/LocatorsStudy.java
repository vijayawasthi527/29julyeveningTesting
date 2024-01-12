package webElementsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStudy {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.naukri.com/");
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		//Thread.sleep(2000);
		//driver.close();
		
		//driver.findElement(By.xpath("//input[@class='suggestor-input ']")).sendKeys("Linux System Administrator");
	     
		//driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hellofriend@vijay.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9kpt _4jy5 _4jy1 selected _51sy']")).click();
		
		
		
		//driver.close();
	
	}

}
