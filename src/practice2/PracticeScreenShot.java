package practice2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;



public class PracticeScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
//		RandomString s= new RandomString();
//		String rs=s.make(4);
		String rs = RandomString.make(3);
		
		File dest=new File("C:\\Users\\vijay\\Desktop\\Class Notes\\Selenium_Notes\\ScreenShot\\MyFile"+rs+".png");
		
		FileHandler.copy(src, dest);
		
	}

}
