package coverFoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFox_AddressDetails 
{
	@FindBy(className = "mp-input-text") private WebElement pincodeField;
	@FindBy(id = "want-expert") private WebElement mobileNumberField;
	@FindBy(xpath = "//div[text()='Continue']")private WebElement continueButton;
	
	public CoverFox_AddressDetails(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterPincode(String pincode)
	{
		pincodeField.sendKeys(pincode);
	}
	
	public void enterMobileNumber(String mobileNumber)
	{
		mobileNumberField.sendKeys(mobileNumber);
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
}
