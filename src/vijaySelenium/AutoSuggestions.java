package vijaySelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("Https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement search = driver.findElement(By.xpath("//textarea[@name='q']"));
		Thread.sleep(2000);
		
//		List<WebElement> mylist = driver.findElements(By.className("G43f7e"));
//		for(WebElement ll:mylist)
//		{
//			System.out.println(ll.getText());
//		}
//		
		Actions act=new Actions(driver);
		act.click(search).perform();
//		Thread.sleep(1000);
//		
//		for(int i=0;i<=3;i++)
//		{
//			act.keyDown(Keys.ARROW_DOWN).perform();
//			
//		}
		//act.keyDown(Keys.ENTER).perform();
		act.keyDown(Keys.SHIFT).sendKeys("sara").keyUp(Keys.SHIFT).sendKeys("awasthi").build().perform();
		
		
		
	}

}
