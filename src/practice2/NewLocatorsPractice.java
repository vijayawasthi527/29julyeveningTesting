package practice2;

import java.net.SocketException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.ConnectionClosedException;
import org.openqa.selenium.support.ui.Select;

public class NewLocatorsPractice {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		boolean radioButton = driver.findElement(By.xpath("(//input[@name='radioButton'])[1]")).isSelected();
		System.out.println(radioButton);
		
		driver.findElement(By.id("autocomplete")).sendKeys("Vijay");
		
		WebElement myDropDown = driver.findElement(By.id("dropdown-class-example"));
		
		Select st=new Select(myDropDown);
		
		st.selectByVisibleText("Option3");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		Thread.sleep(2000);
		
		driver.findElement(By.name("checkBoxOption2")).click();
		
		String mypageid = driver.getWindowHandle();
		System.out.println(mypageid);	
		
		driver.findElement(By.xpath("//button[text()='Open Window']")).click();
		
		Set<String> allHandles = driver.getWindowHandles();
		
		Iterator<String> itr= allHandles.iterator();
		String mainPageid=itr.next();
		String childPageid=itr.next();
		
		driver.switchTo().window(childPageid);
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(mainPageid);
		
		driver.findElement(By.xpath("//a[text()='Open Tab']")).click();
		
		Set<String> allHandles1 = driver.getWindowHandles();
		Iterator<String> itr1= allHandles1.iterator();
		String mainPageid1=itr.next();
		String childPageid1=itr.next();
		
		System.out.println(childPageid1);
		
		
		driver.close();
	
	}

}
