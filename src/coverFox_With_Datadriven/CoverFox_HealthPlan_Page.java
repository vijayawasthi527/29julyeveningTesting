package coverFox_With_Datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFox_HealthPlan_Page
{
	@FindBy(className = "next-btn")private WebElement nextButton;
	
	public CoverFox_HealthPlan_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnNextButton()
	{
		nextButton.click();
	}
}
