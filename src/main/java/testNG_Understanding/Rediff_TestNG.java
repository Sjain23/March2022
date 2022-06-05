package testNG_Understanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_TestNG {
	
	public static WebDriver driver;
	public static ChromeOptions options;
	
	@Test
	@Parameters ({"Browser", "url", "username", "password", "signinButton", "logoutButton"})
	public void launchRediff(String Browser, String url, String username, String password, String Xpath, String logout)
	{
		if (Browser.equals("Chrome"))
		{
		WebDriverManager.chromedriver().setup();
		options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		}
		
		driver.get(url);	//Browser
		driver.findElement(By.id("login1")).sendKeys(username);	//username
		driver.findElement(By.id("password")).sendKeys(password);	//password
		driver.findElement(By.xpath(Xpath)).click();	//signinButton
		driver.findElement(By.className(logout)).click();
	}

	@Test
	public void tearDown()
	{
		driver.quit();
	}
		

}
