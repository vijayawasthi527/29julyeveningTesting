package setSizeAndSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bhaskar.com/");
		Thread.sleep(2000);
		
		Point defaultPosition = driver.manage().window().getPosition();
		System.out.println(defaultPosition);
		
		Point p=new Point(300,200);
		driver.manage().window().setPosition(p);
		Point newPosition = driver.manage().window().getPosition();
		System.out.println(newPosition);
		
//		System.out.println(driver.manage().window().getPosition());
		

	}

}
