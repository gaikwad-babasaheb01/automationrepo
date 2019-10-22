package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClass1 {

	@Test
	public void login() throws InterruptedException {
		System.out.println("launch chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("http://www.newtours.demoaut.com");

		dr.manage().window().maximize();
		
		//for Textbox
		WebElement username = dr.findElement(By.name("userName"));
		username.sendKeys("mercury");
		username.clear();
		// Thread.sleep(2000);

		dr.findElement(By.name("userName")).sendKeys("mercury");

		dr.findElement(By.name("password")).sendKeys("mercury");

		// button
		dr.findElement(By.name("login")).click();
		
		// radio button
		System.out.println(dr.findElement(By.xpath("//input[@value='oneway']")).isSelected());
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		System.out.println(dr.findElement(By.xpath("//input[@value='oneway']")).isSelected());

		
		//continue button for 2 page
		WebElement pass= dr.findElement(By.xpath("//select[@name='passCount']"));
		Select sel= new Select(pass);
		
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("2");
		Thread.sleep(2000);
		sel.selectByVisibleText("4");
				
		/*
		 * dr.findElement(By.name("findFlights")).click();
		 * 
		 * //continue button for page 3
		 * dr.findElement(By.name("reserveFlights")).click();
		 * 
		 * //name dr.findElement(By.name("passFirst0")).sendKeys("babasaheb");
		 * dr.findElement(By.name("passLast0")).sendKeys("Gaikwad");
		 */
	}

}
