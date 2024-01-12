package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class NewPracticeScreenShot3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jagran.com/");
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
//		RandomString rs=new RandomString();
//		String s=rs.make(4);
		String s = RandomString.make(3);
		
		File dest=new File("C:\\Users\\vijay\\Desktop\\Class Notes\\hi"+s+".jpg");
		
		FileHandler.copy(src, dest);
	}

}
