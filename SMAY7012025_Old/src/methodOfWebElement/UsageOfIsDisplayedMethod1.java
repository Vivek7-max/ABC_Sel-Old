package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayedMethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(3000);
		
		if(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed()) {
			System.out.println("PASS:: Dashboard Heading is displayed after login");
		}else {
			System.out.println("FAIL:: Dashboard Heading is not displayed after login");
		}
		
		driver.quit();
	}

}
