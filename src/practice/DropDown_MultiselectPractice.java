package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_MultiselectPractice {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		Thread.sleep(1000);
		
		WebElement result2 =driver.findElement(By.id("dropdowm-menu-1"));
		
		System.out.println(result2.isSelected());
		
		Select s=new Select(result2);
		
		s.selectByIndex(3);
		//s.selectByValue();
		//s.selectByVisibleText(null);
		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Python");
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://igsindia.net/");
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/article/div/div/div/div[8]/div[2]/div[2]/div/div/div/div[2]/p[4]/a/strong")).click();
		
		
	
	
	}

}
