package new_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class Pom_Practice 
{

	@FindBy(xpath = "//input[@value='radio2']") private WebElement radioButton;
	
	public Pom_Practice(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void radioButtonClick()
	{
		radioButton.click();
	}
}
