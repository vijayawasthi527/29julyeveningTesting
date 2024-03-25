package vijaySelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSetSize {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Https://www.facebook.com");
		Thread.sleep(2000);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		Dimension d=new Dimension(100,100);
		
		driver.manage().window().setSize(d);
		
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		
		Point p=new Point(3,3);
		driver.manage().window().setPosition(p);
	}

}
