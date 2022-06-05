 package extentreports_basics;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginTest {
	
	//What is Extent Report - it is a logger (kind of an object which logs certain messages) style reporting library for automated tests
	//What does it do? - it adds info about test cases, screenshots, assigning tags, series of steps and sequencing those step
	// All methods inside Extent Reports are thread safe - Recommend to create a single instance of Extent Reports
	
	@Test
	public void login(){
		//Step1: - Create the object of ExtentReports Class
		
		ExtentReports extent = new ExtentReports();	//ExtentReports is an internal class responsible for generation of extent reports
													// ExtentReports acts as a subject
		
		//Step2: - Create the object of ExtentSparkReporter (acts as an observer) and it is attached to ExtentReporter(Subject) Class
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		spark.config().setReportName("Extent Report Testing");
		spark.config().setDocumentTitle("ProjectName_JIRAstory_QA/UAT/Prod Extent Reports");
		spark.config().setTheme(Theme.DARK);
		spark.config().setEncoding("utf-8");
		
		//Step 3: - need to attach the report
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("Login Functionality Test");	//returns object of Class ExtentTest
		test.log(Status.INFO, "Satrt Login Test Case");
		test.log(Status.INFO, "Opening Browser");
		test.log(Status.INFO, "Validate Signin Link");
		test.log(Status.FAIL, "Server 500 Error");
		Assert.fail("Server 500 error"); // the control will not go to flush and it will not generate the report
		test.log(Status.INFO, "Enter User Credentials");
		test.log(Status.INFO, "Login Test Pass");
		
		//Step 4: - Need to call the method flush() - it instructs ExtentReports to write the test info at a certain destination
		
		extent.flush();
		
		
	}
	
}
