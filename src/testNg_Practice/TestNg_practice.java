package testNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_practice {
  @Test(invocationCount=5,priority=4)
  public void login()
  {
	  Reporter.log("This is the message from login method",true);
  }
  
  @Test(priority=3,invocationCount=2,dependsOnMethods= {"login"})
  public void signup()
  {
	  Reporter.log("This is the signup method",true);
  }
  
  @Test(priority=-1)
  public void addtocart()
  {
	  Reporter.log("This is the method from enabled false method",true);
  }
  
  @Test(enabled=true,priority=-2)
  public void signout()
  {
	  Reporter.log("This is the output from signout method",true);
  }
  
  @Test(groups="Regression")
  public void home()
  {
	  Reporter.log("This method is belogs to sanity group");
  }
  
  @Test(groups="Regression")
  public void newhome()
  {
	  Reporter.log("This method is belogs to regression method");
  }
}

