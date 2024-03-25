package vijaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(2000);
		
		
		WebElement multi = driver.findElement(By.id("cars"));
		
		
		Select s=new Select(multi);
		boolean status = s.isMultiple();
		
		if(status==true)
		{
			s.selectByIndex(0);
			s.selectByValue("opel");
		}

	}

}
