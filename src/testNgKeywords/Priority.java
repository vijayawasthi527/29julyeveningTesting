package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority = 2)
public void a() //0,-2,2,-5 --> -5 ,-2 ,2 ,2
{
Reporter.log("TC a is running", true);
}
@Test(priority = -2)
public void b()
{
Reporter.log("TC b is running", true);
}
@Test(priority = 2)
public void c()
{
Reporter.log("TC c is running", true);
}
@Test(priority = -5)
public void d()
{
Reporter.log("TC d is running", true);
}
}
