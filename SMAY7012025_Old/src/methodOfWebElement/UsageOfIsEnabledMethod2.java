package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabledMethod2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		if(driver.findElement(By.id("loginbutton")).isEnabled()) {
			System.out.println("PASS:: Login Button is Enabled");
		}else {
			System.out.println("FAIL:: Login button is Disabled");
		}
		
		driver.quit();

	}

}
