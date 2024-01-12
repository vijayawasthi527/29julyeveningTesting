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

public class NewPracticeOfScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("whoareyou@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hello@user");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		RandomString rs=new RandomString();
//		String ss = rs.make(3);
		
		String ss = RandomString.make(3);
		
		File dest=new File("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\image"+ss+".png");
		
		FileHandler.copy(src, dest);

	}

}
