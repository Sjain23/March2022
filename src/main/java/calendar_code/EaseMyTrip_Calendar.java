package calendar_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EaseMyTrip_Calendar {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		WebDriverWait wait = new WebDriverWait(driver, 3);
		driver.findElement(By.xpath("//input[@id='ddate']")).click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='month']")));
		
		String MonthYear = driver.findElement(By.xpath("//div[@class='month']")).getText();
		System.out.println(MonthYear);
		String month = MonthYear.split(" ")[0].trim();
		String year = MonthYear.split(" ")[1].trim();
		
		while(!(month.equals("JUL") && year.equals("2024"))) {
			driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
			
			MonthYear = driver.findElement(By.xpath("//div[@class='month']")).getText();
			month = MonthYear.split(" ")[0].trim();
			year = MonthYear.split(" ")[1].trim();
		}
		driver.findElement(By.xpath("//li[@id='frth_2_23/07/2024']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='rdatelbl']")).isEnabled());
		driver.findElement(By.xpath("//div[@id='rdatelbl']")).click();
		//MonthYear = driver.findElement(By.xpath("//div[@class='month']")).getText();
		//System.out.println(MonthYear);
		//month = MonthYear.split(" ")[0].trim();
		//year = MonthYear.split(" ")[1].trim();
		
		while(!(month.equals("SEP") && year.equals("2024"))) {
			driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
			
			MonthYear = driver.findElement(By.xpath("//div[@class='month']")).getText();
			month = MonthYear.split(" ")[0].trim();
			year = MonthYear.split(" ")[1].trim();
		}
		driver.findElement(By.xpath("//li[@id='frth_1_23/09/2024']")).click();
	}

}
