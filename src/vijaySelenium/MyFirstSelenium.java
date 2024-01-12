package vijaySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenium {

	public static void main(String[] args)
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.bhaskar.com/");
	}

}
