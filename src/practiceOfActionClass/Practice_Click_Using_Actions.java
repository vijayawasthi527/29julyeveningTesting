package practiceOfActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_Click_Using_Actions {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement button = driver.findElement(By.xpath("//button[text()='New Browser Window']"));
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='field2']"));
		
		Actions act=new Actions(driver);
		act.click(button).perform();
		
		act.sendKeys(textBox,"Vijay Awasthi").perform();
		
		
		
		

	}

}
