package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
  @Test(timeOut = 30)//time in milliseconds
  public void payment() throws InterruptedException 
  {
	  Thread.sleep(24);//time in milliseconds
	  Reporter.log("Payment done",true);
  }
  
  @Test()
  public void couponCode() throws InterruptedException
  {
	  Thread.sleep(200);
	  Reporter.log("40% Discount is applied",true);
  }
  
  @Test(dependsOnMethods = {"couponCode"})
  public void discount()
  {
	  Reporter.log("Discount is used",true);
  }
}
