package webElementsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteNadRelativePath_Study {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.bhaskar.com/");
		
		//find an element by Absolute Path
		
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/ul/li[2]/a/span[text()='वीडियो']")).click();

	}

}
