package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement desc = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		
		//1st method to perform action
		//act.moveToElement(src).clickAndHold().moveToElement(desc).release().build().perform();
	
		//2nd Method to perform action
		act.dragAndDrop(src, desc).perform();
	}

}
