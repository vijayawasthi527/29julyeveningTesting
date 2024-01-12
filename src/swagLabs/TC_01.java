package swagLabs;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement user_name = driver.findElement(By.name("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login_Button = driver.findElement(By.id("login-button"));
		
		user_name.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		
		login_Button.click();
		
		WebElement bagpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		WebElement bikeLight = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		
		bagpack.click();
		bikeLight.click();
		
		WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
		cartButton.click();
		
		List<WebElement> cartItems = driver.findElements(By.className("inventory_item_name"));
		
		System.out.println("Number Of Items are "+cartItems.size());
		
		for(WebElement ci:cartItems)
		{
			System.out.println("CartItem's are "+ci.getText());
			
		}

			Iterator<WebElement> it = cartItems.iterator();
			WebElement item1 = it.next();
			
			if(item1.getText().equals("Sauce Labs Backpack"))
			{
				System.out.println("Selected item is correct as:-> Sauce Labs Backpack");
				driver.findElement(By.id("checkout")).click();
			}
			else 
			{
				System.out.println("Selected Item is not correct");
			}
			
			//put our first and last name and zip code
			
			WebElement firstName = driver.findElement(By.id("first-name"));
			WebElement lastName = driver.findElement(By.id("last-name"));
			WebElement zipCode = driver.findElement(By.id("postal-code"));
			WebElement continueClick = driver.findElement(By.id("continue"));
			
			firstName.sendKeys("Vijay");
			lastName.sendKeys("Sharma");
			zipCode.sendKeys("450000");
			continueClick.click();
			
			WebElement finishButton = driver.findElement(By.id("finish"));
			finishButton.click();
			
			WebElement thankYouMessage = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
			
			if(thankYouMessage.getText().equals("Thank you for your order!"))
			{
				System.out.println("Thanks Message is shown---> Logging out");
				driver.findElement(By.id("react-burger-menu-btn")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("logout_sidebar_link")).click();
			}
			
			else 
			{
				System.out.println("Thank You message is not shown!!!! please check");
			}
	}

}
