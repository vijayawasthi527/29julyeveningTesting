package webElementsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccentureTestByText {

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.accenture.com/in-en");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Case studies & stories']")).click();
		
		driver.navigate().to("https://www.bhaskar.com/");
		
		driver.findElement(By.xpath("//span[text()='होम']")).click();
	}

}
