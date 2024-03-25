package scrolling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		
		WebElement topCompanies = driver.findElement(By.xpath("//h2[text()='Top companies hiring now']"));
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",topCompanies);
		Thread.sleep(2000);
		
		System.out.println(topCompanies.getLocation());//to get exact position on element in x,y 
		
		File src = topCompanies.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\vijay\\Desktop\\Class Notes\\myscreenshot.jpg");
		
		FileHandler.copy(src, dest);

		
		
	}

}
