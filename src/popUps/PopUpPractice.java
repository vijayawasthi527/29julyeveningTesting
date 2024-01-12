package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Thread.sleep(2000);
		
		driver.findElement(By.name("alert")).click();
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		
		alt.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.name("confirmation")).click();
		Thread.sleep(2000);
		
		Alert alt1 = driver.switchTo().alert();
		alt1.dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.name("prompt")).click();
		Thread.sleep(2000);
		
		Alert alt3 = driver.switchTo().alert();
		//alt3.sendKeys("This is a text message for you");
		alt3.accept();
		
		

	}

}
