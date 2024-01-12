package coverFox_insurance_Project_Without_DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage 
{
	@FindBy(xpath = "(//input[@type='number'])[1]")private  WebElement pincode;
	@FindBy(xpath = "(//input[@type='number'])[2]")private WebElement mobileNumber;
	@FindBy(xpath = "//div[text()='Continue']")private WebElement continueButton;
	
	
	public CoverFoxAddressDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterPincode()
	{
		pincode.sendKeys("476001");
	}
	
	public void enterMobileNumber()
	{
		mobileNumber.sendKeys("8989891234");
	}
	
	public void clickOnContinueButton() 
	{
		continueButton.click();
	}
	
}
