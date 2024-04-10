package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Interview_Problem 
{
	@Test
	
	public void myTest() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://example.cypress.io/commands/actions");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement textBox = driver.findElement(By.id("password1"));
		String color1=textBox.getCssValue("color");
		System.out.println(color1);
		
		Actions act=new Actions(driver);
		act.moveToElement(textBox).click().build().perform();
		
		Thread.sleep(1000);
		String color=textBox.getCssValue("color");
		System.out.println(color);
		
		
	}

}
