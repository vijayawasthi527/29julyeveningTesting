package practice2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class FullScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Vijayawasthi@abc.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("hello@1234");
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
//		RandomString str=new RandomString();
//		String rs = str.make(4);
		
		String rs = RandomString.make(3);
		
		File dest=new File("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\image"+rs+".jpg");
		
		FileHandler.copy(src, dest);

	}

}
