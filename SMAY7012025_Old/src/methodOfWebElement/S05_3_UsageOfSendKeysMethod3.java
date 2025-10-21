package methodOfWebElement;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S05_3_UsageOfSendKeysMethod3 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		//Find the user name text field
		WebElement userNameTbx = driver.findElement(By.name("username"));
		userNameTbx.sendKeys("Admin");
		
		//Copy the text from user name text field
		userNameTbx.sendKeys(Keys.CONTROL+"A");
		userNameTbx.sendKeys(Keys.CONTROL+"C");
		
		Thread.sleep(2000);
		//Find the password text field
		WebElement passwordTbx = driver.findElement(By.name("password"));
		
		passwordTbx.click();
		//Paste the copied user name into the password text field
		passwordTbx.sendKeys(Keys.CONTROL+"V");
		
		Thread.sleep(2000);
		//click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		//close the browser and stop the server
		driver.quit();
		

	}

}
