package testScript;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import configuration.Configuration;
import libraries.ApplicationLibrary;
import pages.PageInterface;

public class TC_FlightBooking_Login {

	PageInterface page=null;
	WebDriver dr;
	ApplicationLibrary lib;

	@BeforeClass
	public void initialize()
	{	
	  lib = new ApplicationLibrary();
	  
	  
	  
	  //launch Browse
	  dr=lib.launchBrowser("Chrome");
	  page=new PageInterface(dr);
	}
	
	@Test
	public void loginTest()
	{
		lib.navigate(dr, Configuration.url);
		
		String temp=page.homePage.login(Configuration.glabalUserName, Configuration.glabalPassword);
		
		Assert.assertTrue(temp.contains("Find a Flight"));
	}
	
	@Test
	public void logoutTest()
	{
		String temp=page.flightFinder.clickSignOff();
		Assert.assertTrue(temp.contains("Sign-on"));

	}
	@AfterClass
	public void tearDown()
	{
	dr.quit();	
	}
}
