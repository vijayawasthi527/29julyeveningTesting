package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsUse {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		Thread.sleep(2000);
		
		WebElement result = driver.findElement(By.xpath("//input[@value='yellow']"));
		
		boolean test = result.isSelected();
		
		System.out.println(test);
		
		result.click();
		
		boolean result1 = result.isSelected();
		
		System.out.println(result1);
		
	
		
	}	

}
