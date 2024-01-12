package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllLocatorsPractice {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Vijay@vijaymail.com");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("pass")).sendKeys("vijay@123");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(2000);
//		
//		driver.navigate().to("https://www.bhaskar.com/");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[text()='होम']")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[contains(text(),'वीडियो')]")).click();
//		Thread.sleep(2000);
//		
//		driver.navigate().to("https://www.microsoft.com/en-in");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("shellmenu_0")).click();
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.className("c-uhf-nav-link")).click();
//		Thread.sleep(2000);
//		
//		driver.navigate().to("https://www.google.com/");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Vijay");
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh();
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		
		WebElement ar = driver.findElement(By.id("displayed-text"));
		
		System.out.println(ar.isDisplayed());
		System.out.println(ar.isEnabled());
		
		driver.findElement(By.id("checkBoxOption1")).click();
	
		WebElement arr = driver.findElement(By.id("checkBoxOption1"));
		System.out.println(arr.isSelected());
		
		driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement mul = driver.findElement(By.className("col-lg-3"));
		Select s=new Select(mul);
		
		System.out.println(s.isMultiple());
		//s.selectByValue("pizza");
		//s.selectByIndex(1);
		//s.selectByVisibleText("Burger");
		
		
		
	}

}
