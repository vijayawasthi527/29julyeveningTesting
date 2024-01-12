package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice2 {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.scindia.edu/");
	
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("ABOUT US")).click();
	
	Thread.sleep(2000);
	
	driver.get("https://quickschool.niitnguru.com/Scindia/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input[name=txtUserName]")).sendKeys("Vijay Awasthi");
	
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input[type=password]")).sendKeys("vijay@123");

	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input[name=btnLogin]")).click();
	
	}

}
