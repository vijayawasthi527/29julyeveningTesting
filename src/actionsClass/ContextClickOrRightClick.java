package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickOrRightClick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		//example for right click
		
		WebElement rightClickButton = driver.findElement(By.xpath("	"));
		
		Actions act=new Actions(driver);
		
		//1st method to perform right click
		act.contextClick(rightClickButton).perform();
		
		//2nd method to perform the right click
		//act.moveToElement(rightClickButton).contextClick().build().perform();
	
	
	}

}
