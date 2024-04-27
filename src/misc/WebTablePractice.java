package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTablePractice {

	public static void main(String[] args) 
	{
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--headless");
		WebDriver driver=new ChromeDriver(cp);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		int totalRows=rows.size();
		
		int columns = driver.findElements(By.xpath("//table[@class='dataTable']//tr//th")).size();
		System.out.println(totalRows+","+columns);
		
		for(int i=1;i<=columns;i++)
		{
			String headers=driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th["+i+"]")).getText();
			System.out.print(headers+"  ");
		}
		for(int i=1;i<=totalRows-1;i++)
		{
			for(int k=1;k<=columns;k++)
			{
				 String value = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+k+"]")).getText();
			
				 System.out.print(value+"    ");
			}
			System.out.println();
		}
		

	}

}
