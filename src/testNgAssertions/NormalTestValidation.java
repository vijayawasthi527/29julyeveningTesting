package testNgAssertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NormalTestValidation {
  @Test
  public void FbGenderCheckBox() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
	  Thread.sleep(2000);
	  
	  boolean buttonStatus = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	  Assert.assertTrue(buttonStatus,"TC failed RadioButton is not selected");
	  
	  //Assert.assertFalse(buttonStatus,"TC passed radio button selected");
  }
}
