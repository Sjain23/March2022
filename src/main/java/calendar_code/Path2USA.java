package calendar_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Path2USA {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.xpath("//input[@id='travel date']")).click();
		new WebDriverWait (driver, 20).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("datepicker-days")));
		
		selectDate("8" , "Feb" , "2023");
	}
		public static void selectDate(String expectedDay, String expectedMonth, String expectedYear) {
			
		if(expectedMonth.equals("February") && Integer.parseInt(expectedDay)>29) 
		{
		System.out.println("Wrong Date :" + expectedMonth + " : " + expectedDay);
		return;
		}
		
		if (Integer.parseInt(expectedDay) > 31) 
		{
		System.out.println("Wrong Date :" + expectedMonth + " : " + expectedDay);
		return;
		}
		
		
		String MonthYear = driver.findElement(By.className("datepicker-switch")).getText();
		while(!getMonthYear(MonthYear)[0].equals(expectedMonth) && getMonthYear(MonthYear)[1].equals(expectedYear))
		{
		driver.findElement(By.className("next")).click();
		MonthYear = driver.findElement(By.className("datepicker-switch")).getText();
		}
		driver.findElement(By.xpath("//td[text()= '" + expectedDay + "']")).click();
		//driver.close0;
		}
		
		public static String[] getMonthYear(String MonthYear) 
		{
		return MonthYear.split(" ");
		}



}
