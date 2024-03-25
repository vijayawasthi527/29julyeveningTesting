package chromeOptionsClassStudy;

//import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOption_Use {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		ChromeOptions opt=new ChromeOptions();
		
		//result in console without getting user Interface
		
		//opt.addArguments("--headless");
		
		//run chrome in incognito mode
		
		opt.addArguments("--headless");
		
		//opt.addArguments("-disable-notifications");
		
		//opt.addArguments("-version");
		
		//opt.addArguments("start-maximized");
//		
//		ArrayList<String> al=new ArrayList<>();
//		//al.add("--headless");
//		al.add("incognito");
//		al.add("-disable-notifications");
//		al.add("start-maximized");
//		
//		opt.addArguments(al);
		
		WebDriver driver=new ChromeDriver(opt);
		//driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/?gad_source=1&gclid=EAIaIQobChMI9or_tdHZggMVBAFyCh0u4w1QEAAYASAAEgKkY_D_BwE");
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		

	}

}
