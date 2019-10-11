package basicAnamaration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingClass2 {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class TestingClass 2");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class TestingClass 2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method TestingClass 2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method TestingClass 2");
	}
	
	@Test
	public void testCase1()
	{
		
		System.out.println("Test 1");
	}
	@Test
	public void testCase2()
	{
		
		System.out.println("Test 2");
	}

}
