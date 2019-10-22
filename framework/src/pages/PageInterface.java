package pages;

import org.openqa.selenium.WebDriver;

public class PageInterface {
	public Homepage homePage;
	public FlightFinder flightFinder;
	
	public PageInterface(WebDriver dr)
	{
		 homePage=new Homepage(dr);
		 flightFinder= new FlightFinder(dr);		
	}
	
	//add objects of other pages as well
}
