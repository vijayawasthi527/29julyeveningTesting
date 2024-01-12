package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg2Class {
  @Test
  public void myMethod()
  {
	  Reporter.log("Hi this is reporter,with boolean parameeter",true);
	  Reporter.log("Hi this is the reporter,without boolean parameter");
  }
}
