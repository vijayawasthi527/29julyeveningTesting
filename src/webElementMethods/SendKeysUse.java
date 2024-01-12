package webElementMethods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//findElement By id====================
		
		driver.findElement(By.id("email")).sendKeys("Tester123@testmail.com");
		Thread.sleep(2000);
		
		//find element by id===================
		
		driver.findElement(By.id("pass")).sendKeys("Tester@123");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
		
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).clear();
		
		Thread.sleep(2000);
		
		//find element by name=============
		
		driver.findElement(By.name("email")).sendKeys("NewTester@testmail.com");
		
		Thread.sleep(2000);
		
		//find element by name=============
		
		driver.findElement(By.name("pass")).sendKeys("Tester@123");
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.name("pass")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).clear();
		
		Thread.sleep(2000);
		
		//driver.close();
		
		driver.navigate().to("https://www.naukri.com/nlogin/login");
		
		driver.findElement(By.className("pr-60")).sendKeys("Hello123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("usernameField")).sendKeys("Tester@gmail.com");
		
		driver.findElement(By.xpath("//button[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']")).click();
		
		
		
		
		
	}

}
