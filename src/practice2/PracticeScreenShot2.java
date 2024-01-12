package practice2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class PracticeScreenShot2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bhaskar.com/");
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
//		RandomString rm=new RandomString();
//		String s=rm.make(4);
		
		String s = RandomString.make(3);
		
		File desc=new File("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\Myscreen"+s+".png");
		
		FileHandler.copy(src, desc);

	}

	
}
