package practice;

import java.util.List;

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
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		driver.switchTo().frame("frm1");
		WebElement dropdown = driver.findElement(By.id("selectnav2"));
		
		Select s=new Select(dropdown);
		System.out.println(s.isMultiple());
		
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		
		WebElement newDropDown = driver.findElement(By.id("selectnav1"));
		
		Select s2=new Select(newDropDown);
		
		System.out.println(s2.isMultiple());
		
		List<WebElement> optionsList = s2.getOptions();
		for(WebElement a:optionsList)
		{
			System.out.println(a.getText());
		}
		Thread.sleep(1000);
		
		System.out.println("==========get the selected option from the list==========");
		
		s2.selectByIndex(4);
		System.out.println(s2.getFirstSelectedOption().getText());
		

	}

}
