package brokenLinks;

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

public class BrokenLinks
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.bhaskar.com");
		
		//now we are getting the all links present in page(all links will start with anchor tag)
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		for(WebElement element:linklist)
		{
			//each link present in List would have href attribute..so we are going to get url from each link by using get attribute
			String url=element.getAttribute("href");
			System.out.println("-------------------------------");
			System.out.println(url);
			
			//now we are going to check whether the link contains url or not..sometime anchor tags are present but 
			//inside that no value for href...so we have to varify that
			
			if(url==null|| url.isEmpty())
			{
				System.out.println("URL is empty");
				continue;
			}
			
			try {
				//here first we need to create object of URL and pass url as argument to constructor and call method
				//openConnection().This URL class have this method
				//once it opens the connection to server than we have to cast this to HttpURLConnection class
				HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
				
				//we opend the connection but we didnt made any request to server
				
				huc.connect();//now request will be send to the server and response return to the browser
				
				if(huc.getResponseCode()>=400)
				{
					System.out.println(url+" is broken");
				}
				else
				{
					System.out.println(url+" is Valid");
				}
				
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		driver.quit();
	}
}
