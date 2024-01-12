package testNgAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void f() 
  {
	  String a="Pune";
	  String b="Gwalior";
	  String c="Jhansi";
	  
	  //verify a & b are equals or not
	  
	  //Assert.assertEquals(a, b,"A & B are not matching TC failed");
  
	  //verify b & c are not equals
	  
	  Assert.assertNotEquals(b, c,"b & C are equals");
	  Assert.assertNotEquals(a,b,"a & c are equals");
  
  }
}
