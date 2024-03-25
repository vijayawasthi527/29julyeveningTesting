package vijaySelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practicegrouping
{
	@Test(groups = "Sanity")
	public void mytest()
	{
		System.out.println("This is from group sanity");
		Reporter.log("This is the message from reporter1");
	}
	
	@Test(groups = "Regression")
	public void mytest1()
	{
		System.out.println("This is from group regression");
		Reporter.log("This is message from reporter2");
	}
	
	@Test(groups = "Sanity")
	public void mytest2()
	{
		System.out.println("This is from group sanity");
		Reporter.log("This is message from reporter3");
	}

}
