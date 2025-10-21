package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S05_5_UsageOfSendKyesCharSequence1 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		//sendKeys() will accept the argument in the form of CharSequence
		//CharSequence is the super interface of StringBuilder and StringBuffer
		
//		StringBuilder username = new StringBuilder("Admin");
		StringBuffer username1 = new StringBuffer("Sheela");
		
//		driver.findElement(By.name("username")).sendKeys(username);
		
		driver.findElement(By.name("username")).sendKeys(username1);
		
		//close the browser and stop the server
		driver.quit();
	}

}
