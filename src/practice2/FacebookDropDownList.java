package practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDownList {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		
		Thread.sleep(2000);
		
		WebElement din = driver.findElement(By.id("day"));
		
		Select s=new Select(din);
		
		System.out.println(s.isMultiple());
		
		List<WebElement> list = s.getOptions();
		
		for(WebElement a:list)
		{
			System.out.println(a.getText());
		}
		
		s.selectByIndex(23);
		
		System.out.println(s.getFirstSelectedOption().getText());

	}

}
