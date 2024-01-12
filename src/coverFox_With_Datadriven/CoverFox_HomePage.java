package coverFox_With_Datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFox_HomePage
{
	
	@FindBy(xpath = "//div[text()='Male']")private WebElement genderSelect;
	
	public CoverFox_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnMale()
	{
		genderSelect.click();
	}
	
	
}
