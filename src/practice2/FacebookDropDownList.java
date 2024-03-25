package practice2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FacebookDropDownList {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
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
