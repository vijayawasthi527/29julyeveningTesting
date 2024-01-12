package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTest {

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//css=tag#id======================
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("Vijay@vijaymail.com");
		
		Thread.sleep(1000);
		
		//css=tag.class========================
		
		driver.findElement(By.cssSelector("input._9npi")).sendKeys("vijay@123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		//css=tag[attribute=value]=====================
		
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("vijay@testmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[placeholder=Password]")).sendKeys("vijay@123");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[name=login]")).click();
		Thread.sleep(1000);
		
		driver.get("https://mppsc.mp.gov.in/");

		Thread.sleep(2000);
		
		//css=tag.class[attribute=value]================
		
		driver.findElement(By.cssSelector("a.nav-link[title='Download Formats']")).click();
		
		
		
		
		
		
		}

}
