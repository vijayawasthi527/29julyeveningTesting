package webElementsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeRedBusByAttributeAndText {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.com/");
		
		Thread.sleep(3000);
		
		//driver.close();
		
		//xpath by attribute---->

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("MORENA");
		Thread.sleep(2000);
		
		//xpath by attribute---->
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("GWALIOR");
		Thread.sleep(2000);
		
		//xpath by text---->
		driver.findElement(By.xpath("//div[text()='SEARCH']")).click();
		
		Thread.sleep(3000);
		
		//xpath by contains()---->
		
		//1.Contains with attribute :---->
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
		
		Thread.sleep(3000);
		
		//Contains with text() :---->
		
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//h2[contains(text(),'you connect and share')]")).click();
		
		//xpath by index---->
		
		driver.navigate().to("https://www.bhaskar.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ad3ccf1a'])[5]")).click();

		
		
		
		
	}

}
