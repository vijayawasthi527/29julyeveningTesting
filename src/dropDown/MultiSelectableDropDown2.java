package dropDown;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectableDropDown2 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(2000);
		
		WebElement dp = driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select s=new Select(dp);
		
		System.out.println(s.isMultiple());
		
		System.out.println("========================get all options using for each loop=================== ");
		
		List<WebElement> cars = s.getOptions();
		
		for(WebElement c:cars)
		{
			System.out.println(c.getText());
		}
		
		System.out.println("============================get all options using Iterator================== ");
		
		Iterator<WebElement> it = cars.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		System.out.println("===========================get all options using ListIterator================");
		
		ListIterator<WebElement> lit = cars.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next().getText());
		}
	
		s.selectByIndex(0 );
		s.selectByValue("saab");
		s.selectByVisibleText("Audi");
		
		System.out.println("=============get all the selected elements==========");
		
		List<WebElement> SelectedOptions = s.getAllSelectedOptions();
		
		for(WebElement a:SelectedOptions)
		{
			System.out.println(a.getText());
		}
		
		

	}

}
