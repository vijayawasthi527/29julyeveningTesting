package new_Practice;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners_Demo implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName()+"  Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName()+"  Test is successFully Executed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getName()+"   Test is Failed");
	}
	

}
