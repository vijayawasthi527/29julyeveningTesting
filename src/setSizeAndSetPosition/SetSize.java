package setSizeAndSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetSize {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bhaskar.com/");
		Thread.sleep(2000);
		
		Dimension defaultSize = driver.manage().window().getSize();
	
		System.out.println(defaultSize);
		
		Dimension d=new Dimension(250,930);
		Thread.sleep(2000);
		
		driver.manage().window().setSize(d);
		
		

	}

}
