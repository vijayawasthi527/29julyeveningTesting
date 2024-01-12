package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg3Class {
  @Test
  public void fbLaunch()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  Reporter.log("FB Lauching",true);
  }
  
  @Test
  public void instaLaunch()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.instagram.com");
	  Reporter.log("Instagram Launch",true);
  }
  
  @Test
  public void twitterLaunch()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://twitter.com");
	  Reporter.log("Twitter Launch",true);
  }
}
