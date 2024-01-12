package practice2;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultipleSelect {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(2000);
		
		WebElement cars = driver.findElement(By.name("cars"));
		
		Select s=new Select(cars);
		
		System.out.println(s.isMultiple());
		
		List<WebElement> list = s.getOptions();
		System.out.println("==============get all options using for loop============");
		
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		System.out.println("===============get all options using for eacch loop============");
		
		for(WebElement a:list)
		{
			System.out.println(a.getText());
		}
		
		System.out.println("==============get all options using iterator==============");
		
		Iterator<WebElement> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		System.out.println("===============get all options using listIterator===========");
		 ListIterator<WebElement> li = list.listIterator();
		 while(li.hasNext())
		 {
			 System.out.println(li.next().getText());
		 }
		 
		 System.out.println("============reverse list using list Iterator===========");
		 while(li.hasPrevious())
		 {
			 System.out.println(li.previous().getText());
		 }
		 
		 s.selectByIndex(0);
		 s.selectByValue("saab");
		 s.selectByVisibleText("Opel");
		 
		 System.out.println("==============get selected options===============");
		 
		 List<WebElement> ch = s.getAllSelectedOptions();
		 for(WebElement c:ch)
		 {
			 System.out.println(c.getText());
		 }

	}

}
