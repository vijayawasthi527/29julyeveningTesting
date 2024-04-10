package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		//handling the alert popup
		
		Alert alt = driver.switchTo().alert();
		
		//if we want to click on OK button
		
		Thread.sleep(2000);
		alt.dismiss();
		//alt.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.name("cusid")).sendKeys("vijay001234");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		
		alt.dismiss();
		
		

	}

}
