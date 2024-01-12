package coverFoxTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import coverFoxBase.Base;
import coverFoxUsingTestNg.CoverFoxAddressDetailsPage;
import coverFoxUsingTestNg.CoverFoxHealthPlanPage;
import coverFoxUsingTestNg.CoverFoxHealthPlanResultsPage;
import coverFoxUsingTestNg.CoverFoxHomePage;
import coverFoxUsingTestNg.CoverFoxMemberDetailsPage;
import coverFoxUtility.Utility;
import coverFox_With_Datadriven.CoverFox_HomePage;

@Listeners(listeners.ListenerCoverFox.class)

public class CF_TC555_Validate_search_results_for_healthcare_policies extends Base
{
	CoverFoxHomePage home;
	CoverFoxHealthPlanPage healthPlan;
	CoverFoxAddressDetailsPage addressDetails;
	CoverFoxMemberDetailsPage memberDetails;
	CoverFoxHealthPlanResultsPage result;
	
	
  @BeforeClass
  public void launchBrowser() throws InterruptedException 
  {
	  launchCoverFox();
	  home=new CoverFoxHomePage(driver);
	  healthPlan=new CoverFoxHealthPlanPage(driver);
	  addressDetails=new CoverFoxAddressDetailsPage(driver);
	  memberDetails=new CoverFoxMemberDetailsPage(driver);
	  result=new CoverFoxHealthPlanResultsPage(driver);
	  
	  
  }
  
  @BeforeMethod
  public void enterMemberDetails() throws InterruptedException, EncryptedDocumentException, IOException
  {
	  Reporter.log("Click On Gender Button",true);
	  home.clickOnMaleButton();
	  Thread.sleep(1000);
	  
	  Reporter.log("click on next button",true);
	  healthPlan.clickOnNextButton();
	  Thread.sleep(1000);
	  
	  Reporter.log("Handling age dropdown",true);
	  memberDetails.handleAgedropdown(Utility.readDataFromExcel(0,0));
	  Reporter.log("Clicking on next button",true);
	  memberDetails.clickOnNextButton();
	  Thread.sleep(1000);
	  
	  Reporter.log("Entering PinCode",true);
	  addressDetails.enterPincode(Utility.readDataFromExcel(0,1));
	  Reporter.log("Entering Mobile Number",true);
	  addressDetails.enterMobileNumber(Utility.readDataFromExcel(0,2));
	  Reporter.log("Clicking on continue Button",true);
	  addressDetails.clickOnNextButton();
	  Thread.sleep(1000);
	  
  }
  @Test
  public void validateTestPlansFromTextAndBanners() throws InterruptedException, IOException
  {
	  Thread.sleep(5000);
	  Reporter.log("Fetching number of results from text ", true);
	  int textResult = result.avilablePlanNumberFromText();
	  Thread.sleep(7000);
	  Reporter.log("Fetching number of results from Banners ", true);
	  int bannerResult = result.availablePlanNumberFromBanners();
	  Thread.sleep(1000);
	  Assert.assertNotEquals(textResult, bannerResult,"Text results are matching with Banner results, TC is failed");
	  Reporter.log("TC is passed ", true);
	  //Utility.takeScreenShot(driver,"CF_TC555");
  }
  
  @AfterMethod
	public void closeBrowser() throws InterruptedException
	{
	Reporter.log("Closing browser ", true);
	Thread.sleep(3000);
	driver.close();
	}
  
  
}
