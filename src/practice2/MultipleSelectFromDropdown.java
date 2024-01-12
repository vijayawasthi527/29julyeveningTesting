package practice2;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectFromDropdown {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement drop = driver.findElement(By.id("cars"));
		
		Select s=new Select(drop);
		
		System.out.println(s.isMultiple());
		
		List<WebElement> list = s.getOptions();
		
		System.out.println("===========print all option using for loop===========");
		
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		System.out.println("=============print all options using iterator=========== ");
		Iterator<WebElement> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		System.out.println("============print all options using listiterator==========");
		
		ListIterator<WebElement> lt = list.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next().getText());
		}

		System.out.println("===============print all option using for each loop==========");
		
		for(WebElement a:list)
		{
			System.out.println(a.getText());
		}
		
		s.selectByIndex(0);
		s.selectByValue("saab");
		s.selectByVisibleText("Audi");
		
		System.out.println("===========get all selected options=========");
		
		List<WebElement> select = s.getAllSelectedOptions();
		for(WebElement al:select)
		{
			System.out.println(al.getText());
		}
	}

}
