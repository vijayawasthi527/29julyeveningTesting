package misc;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookSignupUsingCommonlyUsedMethods {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		CommonlyUsedMethod.implicitWait(driver, 5);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		CommonlyUsedMethod.implicitWait(driver, 5);
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement surName = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("reg_email__"));
		WebElement confirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
		WebElement password = driver.findElement(By.id("password_step_input"));
		
		
		firstName.sendKeys(CommonlyUsedMethod.readmyDataFromExcel(1, 0));
		surName.sendKeys(CommonlyUsedMethod.readmyDataFromExcel(1,1));
		email.sendKeys(CommonlyUsedMethod.readmyDataFromExcel(1,2));
		confirmEmail.sendKeys(CommonlyUsedMethod.readmyDataFromExcel(1,2));
		password.sendKeys(CommonlyUsedMethod.readmyDataFromExcel(1,3));
		
		Actions act=new Actions(driver);
		
		WebElement birthDate = driver.findElement(By.name("birthday_day"));
		WebElement birthMonth = driver.findElement(By.name("birthday_month"));
		WebElement birthYear = driver.findElement(By.name("birthday_year"));
		WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		WebElement signUp = driver.findElement(By.name("websubmit"));
		
		act.moveToElement(birthDate).click().sendKeys(Keys.ARROW_DOWN).build().perform();
		act.click(birthMonth).sendKeys(Keys.ARROW_UP).build().perform();
		act.click(birthYear).perform();
		for(int i=1;i<=30;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.click(birthYear).perform();
		
		act.click(gender).perform();
		
		act.click(signUp).perform();
		
		CommonlyUsedMethod.takeScreenshot(driver,"Fb_SignUP_test");
		
				
	}

}
