package practice2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromWebTable {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Read all table headers 
		
		System.out.println("==================================================");
		
		List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@id='table02']//tr/th"));
		
		for(WebElement a:allHeaders)
		{
			System.out.print(a.getText()+"  ");
		}
	}

}
