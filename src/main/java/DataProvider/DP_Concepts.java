package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_Concepts {
	// parameterization = validating a single test case with multiple sets of data
	// login() - u1/p1, u2/p2, u3/p3
	
	@Test(dataProvider = "getData")		//Step 3 - linking the test case with the dataprovider
	public void RegisteringNewUser(String username, String browser, int mobile, String email) 	//Step 4 - no of input parameters = no of columns
	{
		
	}

	@DataProvider
	public Object[][] getData()		//Step 1 - returns a 2 Dimensional Object Array
	{
		Object[][] data = new Object[3][4];		//[rows][cols]
		
		data[0][0] = "User1";		//Step 2 - enter the data as per the rows and cols
		data[0][1] = "FChrome";
		data[0][2] = 11111111;
		data[0][3] = "chrome@rediffmail.com";
		
		data[1][0] = "User2";
		data[1][1] = "Firefox";
		data[1][2] = 22222222;
		data[1][3] = "firefox@rediffmail.com";
		
		data[2][0] = "User3";
		data[2][1] = "IE";
		data[2][2] = 33333333;
		data[2][3] = "ie@rediffmail.com";
		
		return data;
				
	}
}
