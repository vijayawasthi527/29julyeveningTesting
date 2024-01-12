package identifyFailCasesInTestNg;


//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Myclass {
  @Test
  public void TC1()
  {
	  //Assert.fail();
	  Reporter.log("Tc1 is running",true);
  }
  
  @Test
  public void Tc2()
  {
	  Reporter.log("Tc2 is running",true);
  }
  
  @Test
  public void Tc3()
  {
	  //Assert.fail();
	  Reporter.log("Tc3 is running",true);
  }
  
  @Test
  public void Tc4()
  {
	  Reporter.log("Tc4 is running",true);
  }
  
  @Test
  public void Tc5()
  {
	  Reporter.log("Tc5 is ruuning",true);
  }
}
