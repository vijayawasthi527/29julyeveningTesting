package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotWithRandomName {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bcci.tv/");
		Thread.sleep(2000);
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//explicit casting of takes screenshot
		//System.out.println(MyFile);
		
			


//		RandomString s=new RandomString();
//		String rs = s.make(4);
		
		String rs = RandomString.make(3);
		
		File Destination=new File("C:\\Users\\vijay\\Desktop\\Class Notes\\Selenium_Notes\\ScreenShot\\myscreenshot"+rs+".png");
		
		FileHandler.copy(Source,Destination);
		
	}

}
