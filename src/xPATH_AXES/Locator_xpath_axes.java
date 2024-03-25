package xPATH_AXES;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindAll;

public class Locator_xpath_axes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers");
		Thread.sleep(2000);
		
		//self
		String text = driver.findElement(By.xpath("//a[contains(text(),'Innocorp')]/self::a")).getText();
		
		System.out.println(text);
		
		//parent
		
		String text1=driver.findElement(By.xpath("//a[contains(text(),'Innocorp')]/parent::td")).getText();
		System.out.println(text1);
		
		//child
		
		List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Innocorp')]/ancestor::tr/child::td"));
		System.out.println("Total Number of childs are- "+childs.size());
		
		//ancestor
		
		String text2 = driver.findElement(By.xpath("//a[contains(text(),'Innocorp')]/ancestor::tr")).getText();
		System.out.println(text2);
		
		//following
		List<WebElement> followingNodes = driver.findElements(By.xpath("//a[contains(text(),'Innocorp')]/ancestor::tr/following::tr"));
		System.out.println("Numnber of following node:- "+followingNodes.size());
		driver.close();
		
	}

}
