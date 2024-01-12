package practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyDropDownMultipleSekection {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
		Select s=new Select(dropdown);
		
		System.out.println(s.isMultiple());
		
		s.selectByIndex(0);
		s.selectByIndex(2);
		
		List<WebElement> fulllist = s.getOptions();
		for(int i=0;i<=fulllist.size()-1;i++)
		{
			System.out.println("This is the full list of dropdown list:--->"+fulllist.get(i).getText());
		}
		
		System.out.println("==============These are the selected options are present in the list=========");
		
		List<WebElement> selected = s.getAllSelectedOptions();
		for(WebElement s2:selected)
		{
			System.out.println(s2.getText());
		}
	}

}
