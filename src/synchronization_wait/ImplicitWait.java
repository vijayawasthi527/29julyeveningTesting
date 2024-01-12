package synchronization_wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://upstox.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}

}
