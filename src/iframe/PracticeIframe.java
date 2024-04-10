package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticeIframe {

 WebDriver driver;
	@Test
	public void iframePractice() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("singleframe");
		Thread.sleep(2000);
		String t = driver.findElement(By.xpath("(//h5[text()='iFrame Demo'])[1]")).getText();
		System.out.println("This is the TextOutput---"+t);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kk");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
		
		driver.switchTo().frame(1);
		Thread.sleep(2000);
	}

}
