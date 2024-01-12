package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingActions {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		
		/*find out a locator of a webelement where we need to perform the action and store it in
		some referen variable*/
		
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		
		/*create a object of Actions class which will accept driver object as a parameter */

		Actions act=new Actions(driver);
		
		/*using one of the Actions class methods perform an action*/
		
		//1.first method to perform action on element
		
		//act.moveToElement(loginButton).perform();
		//act.click().perform();
		
		//2.Second Method to perform action on element
		
		//act.click(loginButton).perform();
		
		//3.Third method to perform action on element
		
		act.moveToElement(loginButton).click().build().perform();	
		

	
		
		
	}

}
