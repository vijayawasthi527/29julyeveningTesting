package testNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pratice_Grouping_TestCases2 {
  @Test(groups = "FirstTime")
  public void fifth()
  {
	  Reporter.log("This is the message from First TC",true);
  }
  
  @Test(groups = "SecondTime")
  public void sixth()
  {
	  Reporter.log("This is the message from Second TC",true);
  }
  
  @Test(groups = "FirstTime")
  public void seventh()
  {
	  Reporter.log("This is the message from Third TC",true);
  }
  
  @Test(groups = "SecondTime")
  public void Eight()
  {
	  Reporter.log("This is the message from Fourth TC",true);
  }
}
