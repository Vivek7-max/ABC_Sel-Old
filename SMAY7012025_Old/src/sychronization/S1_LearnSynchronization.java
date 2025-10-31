package sychronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1_LearnSynchronization {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//implicit wait = 10sec.
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
	
		driver.findElement(By.name("password")).sendKeys("admin123");
			
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.quit();
		
	}
}
