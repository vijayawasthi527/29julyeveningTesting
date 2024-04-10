package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks1
{
	
	@Test
	public void brokenLink_Check() throws MalformedURLException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.nothing.tech/pages/phone-1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement i:links)
		{
//			System.out.println(i.getText());
			String url=i.getAttribute("href");
			System.out.println("--------------------");
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
					System.out.println(url+"is broken");
				}
				else
				{
					System.out.println(url+"is valid");
				}
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		try
		{
		driver.close();
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
