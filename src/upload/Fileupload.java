package upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		 
		
		//if upload button ko inspect karne par type=file likha ho to sendkeys use kar sakte hain
		// driver.findElement(By.xpath("//input[@id=\"uploadFile\"]")).sendKeys("C:\\Users\\vijay\\Desktop\\Important");
		
		
//		Thread.sleep(2000);
		WebElement uploadButton = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",uploadButton);
		
		Actions act=new Actions(driver);
		act.moveToElement(uploadButton).click().perform();
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		StringSelection ss=new StringSelection("C:\\Users\\vijay\\Desktop\\Important");//this will copy the file in clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		//perform ctrl+v to action to paste
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		

	}

}
