package coverFoxUsingTestNg;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.functions.Address;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import coverFoxBase.Base;
import coverFoxUtility.Utility;
import coverFox_insurance_Project_Without_DataDriven.CoverFoxHealthPlanPage;






public class CF_TC555_Validate_search_results_for_healthcare_policies 
{
	
	WebDriver driver;
	CoverFoxHomePage home;
	CoverFoxHealthPlanPage healthPlan;
	CoverFoxAddressDetailsPage addressDetails;
	CoverFoxMemberDetailsPage memberDetails;
	CoverFoxHealthPlanResultsPage result;
	
	@BeforeClass
  public void launchBrowser() throws InterruptedException
	{		
		
		driver=new ChromeDriver();
		home=new CoverFoxHomePage(driver);
		healthPlan=new CoverFoxHealthPlanPage(driver);
		addressDetails=new CoverFoxAddressDetailsPage(driver);
		memberDetails=new CoverFoxMemberDetailsPage(driver);
		result=new CoverFoxHealthPlanResultsPage(driver);
		
		Reporter.log("Opening Browser",true);
		driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@BeforeMethod
	public void enterMemberDetails() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("clicking on genderButton",true);
		home.clickOnMaleButton();
		Thread.sleep(1000);
		
		Reporter.log("clicking on next Button",true);
		healthPlan.clickOnNextButton();
		Thread.sleep(1000);
		
		Reporter.log("Handling age dropdown",true);
		memberDetails.handleAgedropdown("27");
		Reporter.log("Clicking on next button",true);
		memberDetails.clickOnNextButton();
		Thread.sleep(1000);
		
		Reporter.log("Entering pin code",true);
		addressDetails.enterPincode("476001");
		Reporter.log("Entering mobile number",true);
		addressDetails.enterMobileNumber("9988776655");
		Reporter.log("Click on continue button",true);
		addressDetails.clickOnNextButton();
		Thread.sleep(2000);
		}

	@Test
	public void validateTestPlansFromTextAndBanners() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		Reporter.log("Fetching Number of results from text",true);
		int textResult=result.avilablePlanNumberFromText();
		Thread.sleep(7000);
		Reporter.log("Fetching number of results from Banners ", true);
		int bannerResult = result.availablePlanNumberFromBanners();
		Thread.sleep(1000);
		Assert.assertEquals(textResult, bannerResult,"Text results are not matching with Banner results, TC is failed");
		Reporter.log("TC is passed ", true);
		
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
	Reporter.log("Closing browser ", true);
	Thread.sleep(3000);
	driver.close();
	}
	
}
