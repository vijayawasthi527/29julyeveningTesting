package coverFox_insurance_Project_Without_DataDriven;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMemberDetailsPage
{
	@FindBy(id = "Age-You")private WebElement ageSelection;
	@FindBy(xpath = "//div[text()='Next']")private WebElement nextButton;
	
	
	public CoverFoxMemberDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void selectAgeDropDown(WebDriver driver)
	{
		Select s=new Select(ageSelection);
		s.selectByValue("33y");
		
	}
	
	public void clickOnNextButton()
	{
		nextButton.click();
	}
}
