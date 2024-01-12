package testNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pratice_Grouping_TestCases {
  @Test(groups = "FirstTime")
  public void first()
  {
	  Reporter.log("This is the message from First TC",true);
  }
  
  @Test(groups = "SecondTime")
  public void second()
  {
	  Reporter.log("This is the message from Second TC",true);
  }
  
  @Test(groups = "FirstTime")
  public void Third()
  {
	  Reporter.log("This is the message from Third TC",true);
  }
  
  @Test(groups = "SecondTime")
  public void Fourth()
  {
	  Reporter.log("This is the message from Fourth TC",true);
  }
}
