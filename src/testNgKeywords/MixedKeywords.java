package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MixedKeywords 
{
  @Test(priority = -1,dependsOnMethods = {"d"})
  public void a() 
  {
	  Reporter.log("Tc a is running" ,true);
  }
  
  @Test
  public void b()
  {
	  Reporter.log("Tc b is running",true);
  }
  
  @Test
  public void c()
  {
	  Reporter.log("Tc c is running",true);
  }
  
  @Test(invocationCount = 3)
  public void d()
  {
	  Reporter.log("Tc d is running",true);
  }
}
