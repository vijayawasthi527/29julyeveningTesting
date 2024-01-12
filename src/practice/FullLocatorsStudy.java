package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FullLocatorsStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//xpath by attribute
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("autocomplete")).sendKeys("HelloTester");
		
		WebElement dp = driver.findElement(By.id("dropdown-class-example"));
		
		Select s=new Select(dp);
		Thread.sleep(2000);
		s.selectByValue("option2");
		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Option3");
		
		Thread.sleep(2000);
		
		s.selectByIndex(1);
		Thread.sleep(2000);
		
		driver.findElement(By.name("checkBoxOption2")).click();
		Thread.sleep(2000);
		
		//xpath by contains
		//driver.findElement(By.xpath("//button[contains(text(),'Open Window')]")).click();
		
		//absolute xpath
		Thread.sleep(2000);
		 //driver.findElement(By.xpath("//html/body/div[2]/div[2]/fieldset/a")).click();
		 
		 //xpath by text
		 Thread.sleep(2000);
		 //driver.findElement(By.xpath("//button[text()='Home']")).click();
		 
		 //driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		 

		 driver.navigate().to("https://www.facebook.com/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("input#email")).sendKeys("Vijay@testmail.com");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("div._6ltj")).click();
		 
		}

}
