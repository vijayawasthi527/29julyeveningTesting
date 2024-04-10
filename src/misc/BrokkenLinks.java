package misc;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokkenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		int count=0;
		int count1=0;
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--headless");
		WebDriver driver=new ChromeDriver(cp);
		driver.get("https://www.loksatta.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement i:links)
		{
			String url = i.getAttribute("href");
			System.out.println("----------------");
			System.out.println(url);
			try
			{
			HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
			huc.connect();
			
			if(huc.getResponseCode()>400)
			{
				System.out.println(url+" is Broken");
				count++;
			}
			else
			{
				System.out.println(url+" is valid");
				count1++;
			}
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println(count);
		System.out.println(count1);
		

	}

}
