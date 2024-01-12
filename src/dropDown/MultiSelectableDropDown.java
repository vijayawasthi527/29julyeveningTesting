package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectableDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(1000);
		
	WebElement cars = driver.findElement(By.id("cars"));
	
	Select s=new Select(cars);
	
	boolean result = s.isMultiple();
	
	System.out.println(result);
	
	s.selectByIndex(1);
	
	Thread.sleep(2000);
	
	s.selectByValue("opel");
	
	Thread.sleep(1000);
	
	s.deselectAll();
	
	Thread.sleep(2000);
	
	driver.close();
	

	}

}
