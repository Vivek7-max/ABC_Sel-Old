package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S14_UsageOfIsDisplayedMethod1 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		//Enter the user name into the user name text field.
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		//Enter the password into the password text field
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(2000);
		//Click on login button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(3000);
		
		//isDisplayed() - No Arg method - return type is boolean
		//if element is displayed returns the true
		//if element is not displayed returns the false
		//Verification
		if(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed()) {
			System.out.println("PASS:: Dashboard Heading is displayed after login");
		}else {
			System.out.println("FAIL:: Dashboard Heading is not displayed after login");
		}
		
		//close the browser and stop the server
		driver.quit();
	}

}
