package screenShot;

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
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks_FullPractice {

	public static void main(String[] args) throws MalformedURLException, IOException
	{
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--headless");
	
		WebDriver driver=new ChromeDriver(cp);
		driver.get("https://www.vctcpune.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement a:links)
		{
			String url=a.getAttribute("href");
			System.out.println("=================================");
			System.out.println(url);
			try
			{
			if(url==null||url.isEmpty())
			{
				continue;
			}
			else
			{
				HttpURLConnection huc = (HttpURLConnection)(new URL(url)).openConnection();
				huc.connect();
				
				if(huc.getResponseCode()>=400)
				{
					System.out.println(url+"<--------- is Broken");
				}
				else
				{
					System.out.println(url+"<-----------is valid");
				}
			}
		}
			catch (Exception e) {
				// TODO: handle exception
			}

	}
	}
}
