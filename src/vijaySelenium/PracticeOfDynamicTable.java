package vijaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOfDynamicTable {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		int rows=driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tr")).size();
	
		System.out.println(rows);
		int columns=driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tr/th")).size();
	System.out.println(columns);
	}

}
