package waitconditions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait_Concepts {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ChromeOptions options = new ChromeOptions();
		//options.setPageLoadStrategy(PageLoadStrategy.NONE); //slowest mode
		//options.setPageLoadStrategy(PageLoadStrategy.EAGER);	//fastest mode
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);	//normal speed
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);	//->is used in Selenium 3.141....
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); -> is used in Selenium 4
		
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		WebElement user = driver.findElement(By.xpath("//input[@id='login1']"));
		System.out.println(user.isDisplayed());
		
		
	}

}
