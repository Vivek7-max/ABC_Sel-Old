package methodOfWebElement;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeysMethod3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		WebElement userNameTbx = driver.findElement(By.name("username"));
		userNameTbx.sendKeys("Admin");
		
		userNameTbx.sendKeys(Keys.CONTROL+"A");
		userNameTbx.sendKeys(Keys.CONTROL+"C");
		
		Thread.sleep(2000);
		
		WebElement passwordTbx = driver.findElement(By.name("password"));
		
		passwordTbx.click();
		
		passwordTbx.sendKeys(Keys.CONTROL+"V");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		driver.quit();
		

	}

}
