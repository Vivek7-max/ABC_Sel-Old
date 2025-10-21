package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S05_8_UsageOfSendKyesException2 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);

		//If we pass the null as argument then sendKeys() gives - IllegalArgumentException
		//This situation may occur while reading the data from excel file & data is not available
		String username = null;

		driver.findElement(By.name("username")).sendKeys(username);

		//close the browser and stop the server
		driver.quit();
	}
}
