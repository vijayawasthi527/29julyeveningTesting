package new_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWebTableData {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//read single table data from row
		//WebElement myTable = driver.findElement(By.xpath("//table[@id='countries']//tr/td[2]/h3/strong"));
		//System.out.println(myTable.getText());
		
		//Read Complete Row of webTable
		
		List<WebElement> fullRow = driver.findElements(By.xpath("//table[@id='countries']//tr[1]/td"));
		for(WebElement a:fullRow)
		{
			System.out.print(a.getText()+"  ");
		}
		
		System.out.println();
		System.out.println("=============================================================");
		
		//Read one Complete Coulmn
		
		for(int i=2;i<=197;i++)
		{
			WebElement columnData = driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]/td[5]"));
		
			System.out.println(columnData.getText());
		}
		
		
		
		
		

	}

}
