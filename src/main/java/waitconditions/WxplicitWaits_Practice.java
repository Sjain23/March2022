package waitconditions;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WxplicitWaits_Practice {

	public static WebDriver driver;
	
	public static WebDriverWait wait;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com");
		
		wait = new WebDriverWait(driver, 3);
		
		WebElement signin = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("signin"))));
		System.out.println(signin);
		signin.click();
		
		WebElement user = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='login1']"))));
		System.out.println(user);
		user.sendKeys("sunny@rediffmail.com");
		
		WebElement pass = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='password']"))));
		System.out.println(pass);
		pass.sendKeys("Hello123");
		
		WebElement signbtn = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("signinbtn"))));
		System.out.println(signbtn);
		signbtn.click();
		
		// not working elementToBeSelected -> returning boolean
		// visibilityOfElementLocated
	}

}
