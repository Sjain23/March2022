package extentbase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	
	public static ExtentReports getReports() {
		if(extent == null) {
			extent = new ExtentReports(); //code for if it is not generation, then generate.
			spark = new ExtentSparkReporter(System.getProperty("user.dir") + "//extentreports//");
			spark.config().setReportName("Extent Report Testing");
			spark.config().setDocumentTitle("ProjectName_JIRAstory_QA/UAT/Prod Extent Reports");
			spark.config().setTheme(Theme.DARK);
			spark.config().setEncoding("utf-8");
		
			extent.attachReporter(spark);
		}
		return extent;
	}

}
