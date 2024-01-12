package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me')]"));
		
		Actions act=new Actions(driver);
		
		
		//This is the first method to perform the operation 
		
		//act.moveToElement(doubleClickButton).doubleClick().build().perform();
		
		//this is the second method to perform the operation
		act.doubleClick(doubleClickButton).perform();
		
	
	}

}
