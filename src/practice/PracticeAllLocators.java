package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAllLocators {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.railyatri.in/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("from_stn_input")).sendKeys("Morena");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("boarding_to")).sendKeys("Bhopal");
		Thread.sleep(2000);
		
		
		driver.navigate().to("https://www.myvi.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("card-para")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Business']")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.bsnl.co.in/");
		
		//driver.findElement(By.xpath());
		
		

	}

}
