package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeysMethod2 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);
		//Enter the User name into user name text field
		driver.findElement(By.name("username")).sendKeys("Admin");

		Thread.sleep(2000);
		//Enter the password into password text field
		driver.findElement(By.name("password")).sendKeys("admin123");

		Thread.sleep(2000);
		//click on login button using send keys method
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);

		driver.quit();
	}

}
