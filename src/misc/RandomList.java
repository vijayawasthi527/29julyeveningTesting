package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomList {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Honda");
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.className("G43f7e"));
		for(WebElement l:list)
		{
			System.out.println(l.getText());
		}
		
		
		 //WebElement list = driver.findElement(By.className("G43f7e"));
		//System.out.println(list.getText());
		
		
		//driver.findElement(By.xpath("//div[@class='OBMEnb']//ul//li[3]")).click();
		
		
		

	}

}
