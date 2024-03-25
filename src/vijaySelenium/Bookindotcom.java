package vijaySelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bookindotcom {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		
		
		WebDriverWait w= new WebDriverWait(driver,Duration.ofMillis(5000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[28]")));
		
		WebElement popup = driver.findElement(By.xpath("(//button[@type='button'])[28]"));
		
		popup.click();
		
		driver.findElement(By.id(":re:")).sendKeys("Bengalure");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@data-testid,'date-display-field-start')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@data-date='2024-03-13']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@data-date='2024-03-20']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@data-testid='searchbox-form-button-icon']")).click();
		
		
	}

}
