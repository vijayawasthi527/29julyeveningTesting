package coverFox_insurance_Project_Without_DataDriven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CF_TC555_Validate_search_results_for_healthcare_policies {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		CoverFoxHomePage home=new CoverFoxHomePage(driver);
		Thread.sleep(500);
		home.clickOnMaleButton();
		
		CoverFoxHealthPlanPage healthPlan=new CoverFoxHealthPlanPage(driver);
		Thread.sleep(500);
		healthPlan.clickOnNextButton();
		
		CoverFoxMemberDetailsPage memberDetails=new CoverFoxMemberDetailsPage(driver);
		Thread.sleep(500);
		memberDetails.selectAgeDropDown(driver);
		memberDetails.clickOnNextButton();
		
		
		CoverFoxAddressDetailsPage addressdetails=new CoverFoxAddressDetailsPage(driver);
		Thread.sleep(500);
		
		addressdetails.enterPincode();
		
		addressdetails.enterMobileNumber();
	
		addressdetails.clickOnContinueButton();
		
		
		CoverFoxHealthPlanResultsPage planResultsPage=new CoverFoxHealthPlanResultsPage(driver);
		Thread.sleep(7000);
		planResultsPage.validatePlanListWithresults();
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
