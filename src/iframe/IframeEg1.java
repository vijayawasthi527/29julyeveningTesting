package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		driver.switchTo().frame("SingleFrame");//switching to iframe from webpage
		
		String t = driver.findElement(By.xpath("(//h5[text()='iFrame Demo'])[1]")).getText();
		System.out.println("This is the TextOutput---"+t);
		
		//now we are switching to default main page from iframe
		
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		WebElement c = driver.findElement(By.linkText("Iframe with in an Iframe"));
		System.out.println("Button's visibility check:- "+c.isDisplayed());
		
		c.click();
		Thread.sleep(1000);
		
		driver.switchTo().frame(1);
		Thread.sleep(1000);

		String element = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
		System.out.println(element);
	
		driver.switchTo().frame(1);
//		
//		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])"));
//		textbox.sendKeys("Hello User");
//		Thread.sleep(2000);	
//		textbox.clear();
//		
//		//now we are switching to child iframe to immediate parent iframe
//		driver.switchTo().parentFrame();
//		String element1 = driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
//		System.out.println(element1);
//		
//		//now we are switching to child iframe to main page
//		
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
	}

}
