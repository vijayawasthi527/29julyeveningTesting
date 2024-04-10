package vijaySelenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MyBrokenLinks 
{
	int Broken_count;
	int valid_Count;
	@Test
	public void myTest() throws MalformedURLException, IOException
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement l:links)
		{
			
			String url=l.getAttribute("href");
			System.out.println("--------------------------");
			
			if(url==null||url.isBlank())
			{
				continue;
			}
			else
			{
				try
				{
				HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.connect();
				
				if(huc.getResponseCode()>400)
				{
					System.out.println(url+" is Broken");
					Broken_count++;
					
				}
				else
				{
					System.out.println(url+" is valid");
					valid_Count++;
				}
				}
				catch (MalformedURLException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(Broken_count);
		System.out.println(valid_Count);
	}
}
