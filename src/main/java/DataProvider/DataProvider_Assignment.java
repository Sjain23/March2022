package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_Assignment {

	public static WebDriver driver;
	
	@BeforeSuite
	public void sstupDriver()
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "/Users/samarpanjain/Automation Class/Softwares/chromedriver");
	}
	
	@BeforeClass
	public void startDriver()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	@Test(dataProvider = "getData")
	public void login(String username, String password)
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	
	@DataProvider
	public Object[][] getData()		
	{
		Object[][] data = new Object[3][2];		
		
		data[0][0] = "User1";		
		data[0][1] = "pass123";
		
		
		data[1][0] = "User2";
		data[1][1] = "pass321";
		
		
		data[2][0] = "Admin";
		data[2][1] = "admin123";
		
		
		return data;
	}
}
	
	
