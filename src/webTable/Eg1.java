package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//WebElement booktable = driver.findElement(By.name("BookTable"));
		
		//how many rows are present in the table --->
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		int numberOfRows = rows.size();
		System.out.println("Total Number of rows present in table is:-  "+numberOfRows);
		
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		
		int	numberOfColumns=Columns.size();
		System.out.println("Total number of columns are present :--  "+numberOfColumns);
	}

}
