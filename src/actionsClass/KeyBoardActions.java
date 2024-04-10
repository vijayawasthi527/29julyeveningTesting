package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		
		WebElement day = driver.findElement(By.id("day"));
		
		Actions act=new Actions(driver);
//		act.click(day).sendKeys(Keys.ARROW_DOWN).build().perform();	
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		
//		act.sendKeys(Keys.ENTER).perform();
		
		act.click(day).perform();
		for(int i=0;i<=20;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(500);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement fName = driver.findElement(By.name("firstname"));
		
		//act.sendKeys(fName,"Vijay").perform();
		//act.keyDown(fName,Keys.SHIFT).sendKeys("vijay").build().perform();
		
		act.keyDown(fName,Keys.SHIFT).sendKeys("VIJ").keyUp(Keys.SHIFT).sendKeys("ay").build().perform();
		
	
		
		
		
		
	}

}
