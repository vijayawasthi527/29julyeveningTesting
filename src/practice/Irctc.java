package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		

	}

}
