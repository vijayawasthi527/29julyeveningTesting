package testNgAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodUse {
  @Test
  public void myMethod1()
  {
  Reporter.log("TC myMethod1 is running", true);
  }
  @Test
  public void myMethod2()
  {
  Reporter.log("TC myMethod2 is running", true);
  }
  @BeforeMethod
  public void login()
  {
  Reporter.log("Login is done", true);
  }

  @AfterMethod
  public void logOut()
  {
  Reporter.log("LogOut is done", true);
  }
  @BeforeClass
  public void beforeclass()
  {
	  Reporter.log("Before class is running",true);
  }
  @AfterClass
  public void afterclass()
  {
	  Reporter.log("After class is running",true);
  }

  }