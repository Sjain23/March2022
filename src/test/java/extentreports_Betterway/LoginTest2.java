package extentreports_Betterway;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import extentbase.ExtentReportManager;

public class LoginTest2 {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	
	@BeforeMethod
	public void initialize() {
		extent = ExtentReportManager.getReports(); //called this method
		test = extent.createTest("Login2 Functionality Test");
	}
	
	@Test
	public void login2() {
		
		test.log(Status.INFO, "Satrt Login1 Test Case");
		test.log(Status.INFO, "Opening Browser");
		test.log(Status.INFO, "Validate Signin Link");
		test.log(Status.FAIL, "Server 500 Error");
		Assert.fail("Server 500 error");
		test.log(Status.INFO, "Enter User Credentials");
		test.log(Status.INFO, "Login2 Test Pass");

	}
	
	@AfterMethod
	public void finish() {
		extent.flush();
	}

}
