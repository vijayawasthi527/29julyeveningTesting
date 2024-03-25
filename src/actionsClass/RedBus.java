package actionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(3000);
		
		
		
		
		WebElement source = driver.findElement(By.xpath("//input[@id='src']"));
		source.sendKeys("morena");
		source.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		source.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		source.sendKeys(Keys.ENTER);
		
		

	}

}
