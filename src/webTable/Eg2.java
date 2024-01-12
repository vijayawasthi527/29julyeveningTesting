package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//read one table header from 1st row
		WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[2]"));
		System.out.println(data.getText());
		
		System.out.println("=================================");
		
		//read full row
		List<WebElement> fullRow = driver.findElements(By.xpath("//table[@name='BookTable']//tr[3]/td"));
			
		for (WebElement a:fullRow)
		{
			System.out.println(a.getText());
		}
		
		System.out.println("====================================");
		
		//read all headers from the 1st header row
	
		List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		
		for(WebElement ah:allHeaders)
		{
			System.out.print(ah.getText()+" ");
		}
		System.out.println();
		
		System.out.println("======================================");
		
		//read whole column at a time
		
		for (int i=2;i<=7;i++)
		{
			WebElement columndata = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]"));
			System.out.println(columndata.getText());
		}
		
	}

}
