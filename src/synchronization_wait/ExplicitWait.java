package synchronization_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		
		//driver.switchTo().newWindow(WindowType.TAB);
		WebElement otpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(5000));
		driver.findElement(By.name("mobileNumber")).sendKeys("8888888888");
		w.until(ExpectedConditions.elementToBeClickable(otpButton));
		otpButton.click();
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Get OTP']")));
	}

}
