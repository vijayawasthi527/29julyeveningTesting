package makeMyTrip;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MakeMyTrip
{

	@Test
	public void myTrip() throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		
		driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@class='commonModal__close']")).click();
		
		WebElement fromCity = driver.findElement(By.id("fromCity"));
		
		fromCity.sendKeys("Gwalior");
		
		Thread.sleep(1000);
		
		List<WebElement> myList = driver.findElements(By.xpath("(//*[@role='listbox'])[1]"));
		Thread.sleep(2000);
		
		myList.get(0).click();
		
		driver.findElement(By.id("toCity")).sendKeys("indore");
		
		Thread.sleep(1000);
		
		List<WebElement> myList2 = driver.findElements(By.xpath("(//*[@role='listbox'])[2]"));
		myList2.get(0).click();
		
		
	
		driver.findElement(By.xpath("(//*[@class='lbl_input appendBottom10'])[3]")).click();
		Thread.sleep(1000);
		
		for(int i=0;i<=2;i++)
		{
			Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@aria-label='Next Month']")).click();
		}
		
		driver.findElement(By.xpath("//*[@aria-label='Thu Aug 15 2024']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@data-cy='submit']/child::a")).click();
	}
}
