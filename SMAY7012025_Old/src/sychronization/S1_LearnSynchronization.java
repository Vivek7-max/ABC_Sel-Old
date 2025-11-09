package sychronization;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
//implicit wait
public class S1_LearnSynchronization {
	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//implicit wait = 10sec.
		
		//timeouts() method will return Timeouts Interface type of object
		//In Timeouts Interface we have implicitlyWait method
		//In version 3.x.x it accepts two parameters time & time unit
		//TimeUnit is Enum which gives the time units - second, minute, hour, day
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//once we set implicit wait it is applicable for the findElement() and findElements() 
		//implicit timeout is maximum time out up to which control will search the element in DOM
		//once the element is available in DOM remaining time will be nullified
		//The polling period of implicit wait is 0.5 second (500ms)
		//After each 0.5 second control checks for element availability in DOM within timeout limit
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
	
		driver.findElement(By.name("password")).sendKeys("admin123");
			
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.quit();
		
	}
}
