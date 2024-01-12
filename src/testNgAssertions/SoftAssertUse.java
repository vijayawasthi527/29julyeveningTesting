package testNgAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void f()
  {
	  SoftAssert s=new SoftAssert();
	  String a="Hello";
	  
	  String b="name";
	  
	  s.assertEquals(a, b,"a & b are not equals TC failed!!!!");
	  s.assertNull(b,"b is not null TC failed");
	  s.assertAll();
  }
  
  @Test
  public void j()
  {
	  String c=null;
	  String h="cars";
	  
	  SoftAssert s1=new SoftAssert();
	  s1.assertNotNull(h,"h is null TC failed!!!!!");
	  s1.assertNotNull(c,"c is null TC failed");
	  s1.assertAll();
  }
}
