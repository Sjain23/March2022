package calendar_code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar_HardCode {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage ().window() .maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		new WebDriverWait (driver, 10).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		
		String MonthYear = driver.findElement(By.className ("ui-datepicker-title") ).getText();
		System.out.println(MonthYear);
		
		String month = MonthYear.split(" ")[0].trim();
		String year = MonthYear.split(" ")[1].trim();
		
		while(!(month.equals("July") && year.equals("2024"))) 
		{
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		MonthYear = driver. findElement(By.className("ui-datepicker-title")).getText();
		month = MonthYear.split(" ")[0].trim();
		year = MonthYear.split(" ")[1].trim();
		}
		driver.findElement(By.xpath("//a[text()='19']")).click();
	}

}
