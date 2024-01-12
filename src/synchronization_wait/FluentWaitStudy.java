package synchronization_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitStudy {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		
		WebElement getOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		//Wait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1).ignoring(NoSuchElementException.class));
		
		Wait<WebDriver> w= new

				FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		
		w.until(ExpectedConditions.elementToBeClickable(getOtpButton));

	}

}
