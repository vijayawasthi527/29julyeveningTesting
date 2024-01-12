package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledUse {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://auth.discoveryplus.in/login");
	
	Thread.sleep(2000);
	
	Boolean result1 =driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
	
	System.out.println("Get OTP button Status is:- "+result1);
	
	driver.findElement(By.className("mobile-input__input__9tJpP")).sendKeys("8977463489");
	
	Thread.sleep(2000);
	
	Boolean result =driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
	
	System.out.println("Get OTP button Status is:- "+result);
	
	

	}

}
