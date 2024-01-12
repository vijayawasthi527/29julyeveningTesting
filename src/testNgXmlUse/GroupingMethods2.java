package testNgXmlUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingMethods2 {
  @Test(groups = "Sanity")
  public void Tc6() 
  {
	  Reporter.log("Tc6 is running",true);
  }
  
  @Test(groups = "Regression")
  public void Tc7()
  {
	  Reporter.log("Tc7 is running",true);
  }
  
  @Test(groups = "Sanity")
  public void Tc8()
  {
	  Reporter.log("Tc8 is running",true);
  }
  
  @Test(groups = "Sanity")
  public void Tc9()
  {
	  Reporter.log("Tc9 is running",true);
  }

  @Test(groups = "Regression")
  public void Tc10()
  {
	  Reporter.log("Tc10 is running",true);
  }
}
