package practice;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMultiFull {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement list = driver.findElement(By.id("multiselect1"));
		 
		Select s= new Select(list);
		System.out.println(s.isMultiple());
		
		List<WebElement> all = s.getOptions();
		for(int i=0;i<=all.size()-1;i++)
		{
			System.out.println(all.get(i).getText());
		}
		System.out.println("=================using iterator===========");
		
		Iterator<WebElement> itr = all.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
		
		System.out.println("============using listiterator================");
		ListIterator<WebElement> lst = all.listIterator();
		while(lst.hasNext())
		{
			System.out.println(lst.next().getText());
		}
		
		System.out.println("==============reverse listIterator===========");
		
		while(lst.hasPrevious())
		{
			System.out.println(lst.previous().getText());
		}
			

	}

}
