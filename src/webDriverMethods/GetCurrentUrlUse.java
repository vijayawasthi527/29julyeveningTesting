package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		String expectedResult="https://www.google.com/";
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		
		 String actualResult=driver.getCurrentUrl();
		 System.out.println(actualResult);
		 
		 if(actualResult.equals(expectedResult))
		 {
			 System.out.println("positive");
		 }
		 else
		 {
			 System.out.println("Negative");
		 }
		
	}

}
