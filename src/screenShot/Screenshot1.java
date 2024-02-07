package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Screenshot1 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bcci.tv/");
		Thread.sleep(2000);
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//explicit casting of takes screenshot
		//System.out.println(MyFile);
		
		
		File Destination=new File("C:\\Users\\vijay\\Desktop\\Class Notes\\Selenium_Notes\\ScreenShot\\myscreenshot.png");
		
		FileHandler.copy(Source,Destination);
	}

}
