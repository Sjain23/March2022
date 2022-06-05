package extentreports_Betterway;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
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

public class RegistrationTest {
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	
	@BeforeMethod
	public void initializeReg() {
		extent = ExtentReportManager.getReports(); //instead of coding here, we called ExtentReportmanager class we made in src/main in extentbase project
		test = extent.createTest("Registration Functionality Test");	//returns object of Class ExtentTest
	}
	
	@Test
	public void regTest() {
		
		test.log(Status.INFO, "Satrt Registration Test Case");
		test.log(Status.INFO, "Visibility of all Fields");
		test.log(Status.INFO, "Visibility of user details");
		test.log(Status.INFO, "Registration Test Pass");

	}
	
	@AfterMethod
	public void finish() {
		
		extent.flush();
		
	}


}
