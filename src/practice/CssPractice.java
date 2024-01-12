package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mppsc.mp.gov.in/");

		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("a.nav-link[title='Download Formats']")).click();
		
	}

}
