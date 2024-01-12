package vijaySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MySeleniumSecond {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(3000);
		
		//driver.quit();
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.close();
		//driver.manage().window().minimize();
		
		
		
	}

}
