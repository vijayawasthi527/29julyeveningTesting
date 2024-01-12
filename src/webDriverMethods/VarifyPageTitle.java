package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyPageTitle {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vctcpune.com/");
		
		
		
		//System.out.println(driver.getTitle());
		
		String expectedTitle="Velocity | Best Software Training Center";
		
		String actualTitle=driver.getTitle();
		Thread.sleep(3000);
		
		//driver.close();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Congratulations!!!! Tiles are matched");
		}
		else
		{
			System.out.println("Sorry!!!! Titles are not matched");
		}

	}

}
