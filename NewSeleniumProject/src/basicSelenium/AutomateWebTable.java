package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomateWebTable {

	@Test
	public void test()
	{
		System.out.println("launch chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("file:///C:/Users/DELL/Downloads/Practice.html");

		dr.manage().window().maximize();
		
		dr.findElement(By.tagName("tbody"));
		WebElement table=dr.findElement(By.tagName("tbody"));
		
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		
		for(WebElement r:rows)
		{
			
		List<WebElement> cols = r.findElements(By.tagName("td"));
		
		for(WebElement c:cols)
		{
			System.out.println(c.getText());
		}
		}

	}
	
	
}
