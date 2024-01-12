package practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FullDropDownStudy {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		WebElement list = driver.findElement(By.id("multiselect1"));
		
		Select s=new Select(list);
		
		System.out.println(s.isMultiple());
		s.selectByIndex(0);
		s.selectByValue("Hyundaix");
		
		List<WebElement> mylist = s.getOptions();
		for(int i=0;i<=mylist.size()-1;i++)
		{
			System.out.println(mylist.get(i).getText());
		}
		
		System.out.println("===================al selected options===================");
		
		List<WebElement> options = s.getAllSelectedOptions();
		for(WebElement o:options)
		{
			System.out.println(o.getText());
		}
	}

}
