package coverFox_With_Datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CF_TC666_Validate_SearchResults {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		FileInputStream myfile=new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet6");
		String ageData = mysheet.getRow(0).getCell(0).getStringCellValue();
		String pincodeData = mysheet.getRow(0).getCell(1).getStringCellValue();
		String mobNumData = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		CoverFox_HomePage home=new CoverFox_HomePage(driver);
		{
			Thread.sleep(1000);
			home.clickOnMale();
		}
		
		CoverFox_HealthPlan_Page healthPlan=new CoverFox_HealthPlan_Page(driver);
		{
			Thread.sleep(1000);
			healthPlan.clickOnNextButton();
		}
		CoverFox_MemberDetails memberDetails=new CoverFox_MemberDetails(driver);
		{
			Thread.sleep(2000);
			memberDetails.handleAgeDropDown(ageData);
			Thread.sleep(1000);
			memberDetails.clickOnNextButton();
			
		}
		
		CoverFox_AddressDetails addressDetails=new CoverFox_AddressDetails(driver);
		{
			Thread.sleep(2000);
			addressDetails.enterPincode(pincodeData);
			Thread.sleep(2000);
			addressDetails.enterMobileNumber(mobNumData);
			Thread.sleep(2000);
			addressDetails.clickOnContinueButton();
		}
		
		CoverFox_HealthPlan_ResultPage planResult=new CoverFox_HealthPlan_ResultPage(driver);
		{
			Thread.sleep(7000);
			planResult.validPlanListWithResult();
			Thread.sleep(3000);
			driver.close();
		}
				
			
				
		
	}

}
