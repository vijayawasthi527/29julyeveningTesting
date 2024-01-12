package testNgAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullNotNull {
  @Test
  public void f() 
  {
	  String name="Vijay";
	  String blank=null;
	  
	  //now varify that name is not null
	  
	  //Assert.assertNotNull(name,"name is null string hence TC is failed");
	  
	  //now verify that blank is null
	  
	  Assert.assertNull(blank,"Blank is not null hence TC is failed");
  }
}
