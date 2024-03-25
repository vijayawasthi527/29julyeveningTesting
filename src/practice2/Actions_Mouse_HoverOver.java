package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Mouse_HoverOver {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		WebElement mybutton = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(mybutton).perform();
		
	}

}
