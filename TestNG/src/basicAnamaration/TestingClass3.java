package basicAnamaration;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestingClass3 {
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
public void afterTest()
{
	System.out.println("after Test");
	System.out.println("********************************");
}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	public void afterSuit()
	{
		System.out.println("after suite");
	}
}
