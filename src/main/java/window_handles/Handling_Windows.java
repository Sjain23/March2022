package window_handles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Windows {
	
	public static WebDriver driver;
	public static Set<String> handles;
	public static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("The parent window is "+ parentWindowHandle);
		
		//Thread.sleep(4000);
		wait = new WebDriverWait(driver, 5);
		driver.findElement(By.id("newWindowBtn")).click();
		
		handles = driver.getWindowHandles();
		for(String handle1:handles)
		{
			System.out.println(handle1);
			
			if(!handle1.equals(parentWindowHandle))
			{
				driver.switchTo().window(handle1);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("Sunny");
				driver.findElement(By.id("lastName")).sendKeys("Jain");
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindowHandle);
		Actions a1 = new Actions(driver);
		a1.sendKeys(Keys.PAGE_UP).build().perform();
		
		boolean check = driver.findElement(By.className("whTextBox")).isEnabled();
		
		if(check == true){
		driver.findElement(By.className("whTextBox")).sendKeys("Hello");
		}
		else{
			System.out.println("The control has not come back to parent window");
		}
		wait = new WebDriverWait(driver, 5);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		
		driver.findElement(By.id("newTabBtn")).click();
		
		handles = driver.getWindowHandles();
		for(String handle2:handles)
		{
			System.out.println(handle2);
			
			if(!handle2.equals(parentWindowHandle))
			{
				driver.switchTo().window(handle2);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//button[@id='alertBox']")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
		
		handles = driver.getWindowHandles();
		for (String handle3:handles)
		{
			System.out.println(handle3);
			System.out.println(driver.getTitle());
			if(!handle3.equals(parentWindowHandle))
			{
				driver.switchTo().window(handle3);
				driver.manage().window().maximize();
				driver.findElement(By.name("name")).sendKeys("Sunny");
				driver.findElement(By.id("firstName")).sendKeys("Sunny");
			}	
		}
	}

}
