package extentreports_basics;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginTest1 {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	
	@BeforeMethod
	public void initialize() {
		System.out.println(System.getProperty("user.dir"));
		extent = new ExtentReports();
		//spark = new ExtentSparkReporter("/Users/samarpanjain/eclipse-workspace/MarchAutomation/extentreports"); 
		//but this will use local computer drive and other people will not able to access. so we will use user.dir in line 22
		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "//extentreports//");
		spark.config().setReportName("Extent Report Testing");
		spark.config().setDocumentTitle("ProjectName_JIRAstory_QA/UAT/Prod Extent Reports");
		spark.config().setTheme(Theme.DARK);
		spark.config().setEncoding("utf-8");
		extent.attachReporter(spark);
		test = extent.createTest("Login1 Functionality Test");	//returns object of Class ExtentTest
	}
	
	@Test
	public void login1() {
		
		test.log(Status.INFO, "Satrt Login1 Test Case");
		test.log(Status.INFO, "Opening Browser");
		test.log(Status.INFO, "Validate Signin Link");
		test.log(Status.FAIL, "Server 500 Error");
		Assert.fail("Server 500 error"); // the control will not go to flush and it will not generate the report
		test.log(Status.INFO, "Enter User Credentials");
		test.log(Status.INFO, "Login1 Test Pass");

	}
	
	@AfterMethod
	public void finish() {
		//Step 4: - Need to call the method flush() - it instructs ExtentReports to write the test info at a certain destination
		extent.flush();
	}
	
	//This is fine but what is we have amny test cases and each have different details in the report.
	// in that case, we made a code in xtentReportManager Class under src/main folder -> extentbase package
	//We can call that in any class. eg. RegistrationTest Class in src/test project -> extent basic package

}
