package new_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpathaxes_Practice {

	public static void main(String[] args) throws InterruptedException 
	{
//		ChromeOptions cp=new ChromeOptions();
//		cp.addArguments("--headless");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='pass']/preceding-sibling::input")).sendKeys("Hello Vijay");
		
		
		driver.findElement(By.xpath("//input[@id='pass']/following-sibling::button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='pass']/following-sibling::button/following-sibling::input")).sendKeys("Hello user");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='pass']/following-sibling::button/following-sibling::input/parent::div/child::a[1]")).click();
	}

}
