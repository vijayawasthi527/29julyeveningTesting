package testNgAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse {
  @Test
  public void f() 
  {
	  boolean a=true;
	  boolean b=true;
	  
	  //vrifying true
	  //Assert.assertTrue(b,"b value is false hence testcase is failed");
	  
	  //verifying a value is false
	  
	  Assert.assertFalse(a,"a value is true hence test case is failed");
	  //in above line of code tc will be failed and exception will be throne because if a value is true that 
	  //time only it will pass bcoz assertFalse required false value to passs the test case
	  
	  
  }
}
