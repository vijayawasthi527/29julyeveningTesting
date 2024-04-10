package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Broken_Links {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		
		List<WebElement> ListOfLinks = driver.findElements(By.tagName("a"));
		
		for( WebElement i:ListOfLinks)
		{
			System.out.println(i.getText());
		}
		
		
		for(WebElement element:ListOfLinks)
		{
			String url = element.getAttribute("href");
			System.out.println("---------------------");
			System.out.println(url);
			
			
			
			if(url==null|| url.isEmpty())
			{
				continue;
			}
			
			try
			{
				HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.connect();
				
				if(huc.getResponseCode()>400)
				{
					System.out.println(url+" is broken");
				}
				else
				{
					System.out.println(url+" is Valid");
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
			
			
			
			
		driver.close();
	}

}
