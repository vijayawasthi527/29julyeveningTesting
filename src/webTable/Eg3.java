package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg3 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//total number of rows count  present in webtable
		 int totalRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(totalRows);
		
		//total number of column count present in webtable
		int totalColumns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
		System.out.println(totalColumns);
		
		//list of all headers present in webtable
		List<WebElement> totalHeaders = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		for(WebElement a:totalHeaders)
		{
			System.out.print(a.getText()+"  ");
		}
		System.out.println();
		System.out.println("=============================================");
		
		
		for(int i=1;i<=totalRows;i++)
		{
			for(int j=1;j<=totalColumns;j++)
			{
				if(i==1)
				{
					WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]"));
					System.out.print(data.getText()+"      ");
				}
				else
				{
					WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
					System.out.print(data.getText()+"      ");
				}
				
			}
			System.out.println();
		}

	}

}
