package testNG_Understanding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Part1 {
	
	public static WebDriver driver;
	
	@Test(threadPoolSize = 2, invocationCount = 2)
	public void testcase1()
	{
		System.out.println("Checking TestCase1: "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	
	@Test(invocationCount = 2)
	public void testcase2()
	{
		System.out.println("Checking TestCase2: "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
	}
	
	@Test(invocationCount = 2)
	public void testcase3()
	{
		System.out.println("Checking TestCase3: "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rediff.com");
	}

}


// Parallel can be achieved 3 ways. method, class and