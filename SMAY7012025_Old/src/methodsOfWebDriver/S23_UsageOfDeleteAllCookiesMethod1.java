package methodsOfWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class S23_UsageOfDeleteAllCookiesMethod1 {
	//Delete all the cookies from OrangeHRM web site and verify cookies are deleted using URL
	public static void main(String[] args) throws InterruptedException {
		//Launch Browser, Maximize Browser Window and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//get the URL of the web page before deleting the cookies and before login to the application
		String urlBeforeDeletingCookies = driver.getCurrentUrl();
		
		//Enter user name password and click on login button
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Delete all cookies using deleteAllCookies()
		driver.manage().deleteAllCookies();
		//No argument Method
		//Used to delete all the cookies for the current session of the application
		
		Thread.sleep(5000);
		
		//Once all the cookies are deleted, application will be navigated back to login page
		//get the URL of the page after deleting the cookies
		String urlAfterDeletingCookies = driver.getCurrentUrl();
		
		//Verify the URL navigation back to login page
		if(urlBeforeDeletingCookies.equals(urlAfterDeletingCookies)) {
			System.out.println("PASS:: Application navigated back to login page hence all cookies are deleted successfully");
		}else {
			System.out.println("FAIL:: Application not navigated back to login page hence cookies are not deleted");
		}
		
		//Close the window and stop the server
		driver.quit();

	}

}
