package vijaySelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable_Practice {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--headless");
		WebDriver driver =new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		int tableRowCount = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		System.out.println(tableRowCount);
		
		int tableColumnCount=driver.findElements(By.xpath("//table[@class='dataTable']//th")).size();
		System.out.println(tableColumnCount);
		
		for(int i=1;i<=tableColumnCount;i++)
		{
			String headers=driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr/th["+i+"]")).getText();
			System.out.print(headers+"  ");
		}
		
		for(int i=1;i<=tableRowCount-1;i++)
		{
			for(int j=1;j<=tableColumnCount;j++)
			{
				//driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr["+i+"]"/td["+j+"]"))
				String value = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
				 System.out.print(value+"    ");
			}
			System.out.println();
		}

	}

}
