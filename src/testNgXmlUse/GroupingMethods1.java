package testNgXmlUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingMethods1 {
  @Test(groups = "Sanity")
  public void Tc1() 
  {
	  Reporter.log("Tc1 is running",true);
  }
  
  @Test(groups = "Sanity")
  public void Tc2()
  {
	  Reporter.log("Tc2 is running",true);
  }
  
  @Test(groups = "Regression")
  public void Tc3()
  {
	  Reporter.log("Tc3 is running",true);
  }
  
  @Test(groups = "Sanity")
  public void Tc4()
  {
	  Reporter.log("Tc4 is running",true);
  }
  
  @Test(groups = "Regression")
  public void Tc5()
  {
	  Reporter.log("Tc5 is running",true);
  }
}
