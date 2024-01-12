package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframePractice {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(2000);
		
		String mainPageText = driver.findElement(By.xpath("//h1[contains(text(),'Frames Examples in ')]")).getText();
		System.out.println("Text on Main Page is:- "+mainPageText);
		
		driver.switchTo().frame("frame1");//switching selenium focus to frame1 from main page(outer most frame)
		Thread.sleep(2000);
		
		//writing in textbox present in outer frame
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello User");
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame3");
		Thread.sleep(2000);
		
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		
		driver.switchTo().defaultContent();
		String mainPageVerify = driver.findElement(By.xpath("//h1[contains(text(),'Frames Examples in ')]")).getText();

		System.out.println(mainPageVerify);
		
		driver.switchTo().frame("frame2");
		Thread.sleep(2000);
		
		WebElement animal = driver.findElement(By.id("animals"));
		
		Select s=new Select(animal);
		System.out.println(s.isMultiple());
		
		s.selectByValue("babycat");
		
		driver.switchTo().defaultContent();
	}

}
