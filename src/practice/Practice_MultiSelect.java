package practice;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_MultiSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement multi = driver.findElement(By.id("multiselect1"));
		
		Select s=new Select(multi);
		System.out.println(s.isMultiple());
		
		s.selectByIndex(0);
		s.selectByValue("swiftx");
		s.selectByVisibleText("Audi");
		
		List<WebElement> all = s.getOptions();
		
		System.out.println("=============Traverse List using for loop========== ");
		for(int i=0;i<=all.size()-1;i++)
		{
			System.out.println(all.get(i).getText());
		}
		
		System.out.println("=============Traverse List using for each Loop==========");
		for(WebElement a:all)
		{
			System.out.println(a.getText());
		}
		
		System.out.println("==================Traverse using Iterator==========");
		Iterator<WebElement> it = all.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		System.out.println("=========Traverse Using ListIterator===========");
		ListIterator<WebElement> lit = all.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next().getText());
		}
		System.out.println("===========reverse list iterator==========");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous().getText());
		}

	}

}
