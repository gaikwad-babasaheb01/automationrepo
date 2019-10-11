package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider1 {

	@Test(dataProvider="getData")
	public void login(String user, String pass)
	{
		System.out.println("Test Login with username="+user+"and password="+pass);
	}
	
	@DataProvider
	public String[][] getData()
	{
		String[][] data=new String[3][2];
		
		//row 1
		data[0][0]="username1";
		data[0][1]="password1";
		
		//row 2
		data[1][0]="username2";
		data[1][1]="password2";
		
		//row 3
		data[2][0]="username3";
		data[2][1]="password3";
		
		return data;
		
	}
	
}
