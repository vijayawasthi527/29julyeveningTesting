package coverFox_insurance_Project_Without_DataDriven;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanResultsPage {

	@FindBy (xpath = "//div[contains(text(),'matching Health')]")private WebElement resultsInString;
	@FindBy(id = "plans-list")private List<WebElement> planList;
	
	public CoverFoxHealthPlanResultsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void validatePlanListWithresults()
	{
		String test=resultsInString.getText();
		 //49 matching health insurence plans
		
		
		String arr[]=test.split(" ");
		String numberOfResultsInString=arr[0];
		 //converting string into integer
		 
		 int numberOfResultsInInt=Integer.parseInt(numberOfResultsInString);
		 
		 int totalNumberOfPlans=planList.size();
		 
		 
		 if(totalNumberOfPlans==numberOfResultsInInt)
		 {
			 System.out.println("Plans number matching with plans List,TC passed");
		 }
		 
		 else
		 {
			 System.out.println("Plans number is not matching with plans List, TC is failed");

					 
		 }
	}

	

}
