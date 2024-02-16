package practiceOfExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("Vijay");
		
		WebElement date = driver.findElement(By.id("day"));
		
		Select s=new Select(date);
		s.selectByVisibleText("30");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1=new Select(month);
		s1.selectByIndex(6);
		
		
		
	}

}
