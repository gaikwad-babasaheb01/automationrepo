package basicAnamaration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing {
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class TestingClass 1");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class TestingClass 1");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method TestingClass 1");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method TestingClass 1");
	}
	

		@Test(priority=0)
	public void test3()
	{
		System.out.println("Testing 3");
	}
		@Test(priority=1)
		public void test1()
		{
			System.out.println("Testing 1");
		}

		@Test
		public void test2()
		{
			System.out.println("Testing 2");
		}

}
