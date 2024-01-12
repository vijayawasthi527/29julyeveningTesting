package misc;

import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginUsingCommonMethods {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		CommonlyUsedMethod.implicitWait(driver, 5);
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement button = driver.findElement(By.name("login"));
		
		email.sendKeys(CommonlyUsedMethod.readmyDataFromExcel(1, 0));
		password.sendKeys(CommonlyUsedMethod.readmyDataFromExcel(1, 1));
		CommonlyUsedMethod.implicitWait(driver, 5);
		CommonlyUsedMethod.takeScreenshot(driver,"testproof");
		button.click();
		

	}

}
