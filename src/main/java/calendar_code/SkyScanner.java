package calendar_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SkyScanner {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skyscanner.ca/?previousCultureSource=GEO_LOCATION&redirectedFrom=www.skyscanner.com");
		
//		driver.findElement(By.className("DateInput_DateInput--text__MzMyY")).click();
//		
//		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("months")));
//		
//		String MonthYear = driver.findElement(By.name("months")).getText();
//		System.out.println(MonthYear);
//		
//		String month = MonthYear.split(" ")[0].trim();
//		String year = MonthYear.split(" ")[1].trim();
	}

}
