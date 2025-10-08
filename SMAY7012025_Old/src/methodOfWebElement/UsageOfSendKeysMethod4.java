package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeysMethod4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
		driver.findElement(By.name("sView1:r1:0:city")).sendKeys("Bengaluru");
		
		driver.quit();

	}

}
