package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeMixedKeywords
{
  @Test()
  public void a()
  {
	  Reporter.log("This is the execution of test case a",true);
  }
  
  @Test(dependsOnMethods = {"a","c"})
  public void b()
  {
	  Reporter.log("This is the execution of test case b",true);
  }
  
  @Test(timeOut = 200)
  public void c() throws InterruptedException
  {
	  Thread.sleep(301);
	  Reporter.log("This is the execution of test case c",true);
  }
  
  @Test()
  public void d()
  {
	  Reporter.log("This is the execution of test case d",true);
  }
  
}
