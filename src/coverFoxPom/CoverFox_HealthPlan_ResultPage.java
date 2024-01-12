package coverFoxPom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFox_HealthPlan_ResultPage
{
	@FindBy(xpath = "//div[contains(text(),'Health Insurance Plans')]")private WebElement resultsInString;
	@FindBy(id = "plans-list") private List<WebElement> planList;
	
	
	public CoverFox_HealthPlan_ResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void validPlanListWithResult()
	{
		String test=resultsInString.getText();
		String arr[]=test.split(" ");
		String numberOfResultFound=arr[0];
		int numberOfresultsInString=Integer.parseInt(numberOfResultFound);
		int totalresultFound =planList.size();
		
		if(numberOfresultsInString==totalresultFound)
		{
			System.out.println("Results matched!!!!! TC passed");
		}
		else
		{
			System.out.println("Results did not matched!!!!TC failed");
		}
	}

}
