package new_Practice;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class Testclass
{

	Pom_Practice my;
	
	@BeforeMethod
	public void enterDetails()
	{
		Reporter.log("Clicking on radio Button");
		my.radioButtonClick();
	}
}
