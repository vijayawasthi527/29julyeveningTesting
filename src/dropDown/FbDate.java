package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDate {

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vijay");
	
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Vijay");
		
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.id("day"));
		
		Select s=new Select(date);
		
		s.selectByValue("30");
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1=new Select(month);
		
		s1.selectByIndex(6);
		
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s3=new Select(year);
		
		s3.selectByValue("1989");
		
	}

}
