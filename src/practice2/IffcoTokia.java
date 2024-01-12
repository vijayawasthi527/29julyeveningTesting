package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IffcoTokia {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.iffcotokio.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//figcaption[contains(text(),'Health')]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Name'])[1]")).sendKeys("Rahul");
		Thread.sleep(1000);
		//driver.findElement(By.)
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9988710012");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[contains(text(),'View Prices')])[1]")).click();
		Thread.sleep(1000);
		
	}

}
