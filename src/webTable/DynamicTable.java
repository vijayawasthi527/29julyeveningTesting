package webTable;

import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		int Rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		int totalNumberOfRows=Rows;
		
		int columns = driver.findElements(By.xpath("//table[@class='dataTable']//tr/th")).size();
		int totalNumberOfColumns=columns;
		
		System.out.println(totalNumberOfRows);
		System.out.println(totalNumberOfColumns);
		
		for(int i=1;i<=totalNumberOfColumns;i++)
		{
			String headers = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr[1]/th["+i+"]")).getText();
					System.out.print(headers+"   ");
		}
		
		//here we did totalNumberOfRows-1 becoz 1 tr has already counted and used in headers
		for(int j=1;j<=totalNumberOfRows-1;j++)
		{
			for(int k=1;k<=totalNumberOfColumns;k++)
			{
				 String value = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+j+"]/td["+k+"]")).getText();
			
				 System.out.print(value+"    ");
			}
			System.out.println();
		}
		
		
	}

}
