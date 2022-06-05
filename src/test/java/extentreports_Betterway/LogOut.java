package extentreports_Betterway;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import extentbase.ExtentReportManager;

public class LogOut {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	
	@BeforeMethod
	public void logout() {
		extent = ExtentReportManager.getReports(); //instead of coding here, we called ExtentReportmanager class we made in src/main in extentbase project
		test = extent.createTest("Logout Functionality Test");	//returns object of Class ExtentTest
	}
	
	@Test
	public void logoutFuncTest() {
		
		test.log(Status.INFO, "Satrt Logout Test Case");
		test.log(Status.INFO, "Visibility of all Fields");
		test.log(Status.INFO, "Visibility of user details");
		test.log(Status.INFO, "Failed just like that");
		test.log(Status.FAIL, "Registration Test Fail");

	}
	
	@AfterMethod
	public void finish() {
		
		extent.flush();
		
	}


}
