package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample1 {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

	Thread.sleep(2000);
	
	WebElement MyField=driver.findElement(By.id("dropdowm-menu-1"));
	
	//WebElement local = driver.findElement(By.id("dropdowm-menu-1"));
	
	//Select s=new Select(dropDownField);
	
	//s.selectByValue("c#");
	
	Select s=new Select(MyField);
	
	//s.selectByValue("python");
	s.selectByIndex(2);
	
	
	
	
	}

}
