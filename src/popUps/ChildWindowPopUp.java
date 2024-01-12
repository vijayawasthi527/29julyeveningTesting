package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		//getting text on main page
		 WebElement mainPageElement = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		 
		System.out.println("Main page Text is:- "+ mainPageElement.getText());
		
		//clicking on new window button
		
		driver.findElement(By.name("NewWindow")).click();
		
		//to switch child we should know id of child window
		
		String mainPageId = driver.getWindowHandle();
		System.out.println("ID of main page is:- "+mainPageId);
		
		//use getWindowHandles() method to get all page id's
		
		Set<String> allWindowId = driver.getWindowHandles();
	Iterator<String> itr = allWindowId.iterator();
	String mainPageID = itr.next();//it will return mainPageId
	
	String child1ID = itr.next();//it will return id of child1
	
	System.out.println("Main Page id is :- "+mainPageID);
	System.out.println("child page id is:-"+child1ID);
	
	//switching focus from main page to child window

	driver.switchTo().window(child1ID);
	Thread.sleep(2000);
	driver.manage().window().maximize();//will maximize child window
		
		//driver.close(); no such window exception
		driver.findElement(By.id("the7-search")).sendKeys("Good Evening");
		Thread.sleep(2000);
		
		//we will not close child browser ...it might need in future...if we closed that so next time 
		//its id would be changed
		
		
		//switching to main page
		
		driver.switchTo().window(mainPageID);
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//p[contains(text(),'in new browser window')]")).getText();
	
		System.out.println(text);
	}

}
