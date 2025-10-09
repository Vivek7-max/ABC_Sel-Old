package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKyesCharSequence1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
//		StringBuilder username = new StringBuilder("Admin");
		StringBuffer username1 = new StringBuffer("Sheela");
		
//		driver.findElement(By.name("username")).sendKeys(username);
		
		driver.findElement(By.name("username")).sendKeys(username1);

	}

}
