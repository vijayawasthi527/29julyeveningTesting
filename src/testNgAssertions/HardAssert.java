package testNgAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void f()
  {
	  String a="Hello";
	  String b="Hi";
	  
	  
	  Assert.assertEquals(a, b,"a & b is not equals!!!!TC failed");
	  Assert.assertNotNull(a,"a is null,TC is failed!!!!");
	  
	  //hard assert me are @test ke andar ka ek bhi assertion fail ho jaata hai to us test me aage ke 
	  //assertion check nhi karta hai
	  
	 
	 
  }
  
  @Test
  public void h()
  {
	  String k=null;
	  
	  Assert.assertNull(k);
  }
}
