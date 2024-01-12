package practice;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import misc.CommonlyUsedMethod;

public class PracticeAlertPopUpHandling {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		CommonlyUsedMethod.implicitWait(driver, 5);
		
		WebElement custID = driver.findElement(By.name("cusid"));
		WebElement submit = driver.findElement(By.name("submit"));
		
		Actions act=new Actions(driver);
		act.moveToElement(custID).sendKeys(CommonlyUsedMethod.readmyDataFromExcel(1,4)).perform();
		act.click(submit).perform();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();

	}

}
