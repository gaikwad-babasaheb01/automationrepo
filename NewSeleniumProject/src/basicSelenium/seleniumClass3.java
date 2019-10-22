package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumClass3 {
	
	@Test
	public void test() throws InterruptedException
	{
		System.out.println("launch chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");

		dr.manage().window().maximize();
		
		//for checkbox and iframes
		dr.switchTo().frame("iframeResult");
		
		WebElement ele=dr.findElement(By.name("vehicle1"));
		System.out.println(ele.isSelected());
		ele.click();
		System.out.println(ele.isSelected());
			
	}
}
