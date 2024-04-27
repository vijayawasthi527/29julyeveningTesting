package new_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TimePass {
@Test
	public static void mytest() throws InterruptedException 
	{
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--headless");
		WebDriver driver=new ChromeDriver(cp);
		driver.get("https://example.cypress.io/commands/actions");
		Thread.sleep(2000);
		
		String color=driver.findElement(By.xpath("//*[@for='password1']")).getAttribute("style");
		WebElement box=driver.findElement(By.xpath("//*[@type='password']"));
		String textbox=box.getAttribute("class");
		box.click();
		
		String textbox1=box.getAttribute("class");
		
		String color1=driver.findElement(By.xpath("//*[@for='password1']")).getAttribute("style");
		
		
		System.out.println(color1);
		System.out.println(color);
		Assert.assertNotEquals(color,color1,"Test case Failed Values are matched");

	}

}
