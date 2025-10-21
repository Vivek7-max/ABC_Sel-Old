package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S17_UsageOfIsEnabledMethod2 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");

		//isEnabled() - No Arg method - return type is boolean
		//It is used to verify if element is enabled or not
		//verification: check the button is enabled or not
		if(driver.findElement(By.id("loginbutton")).isEnabled()) {
			System.out.println("PASS:: Login Button is Enabled");
		}else {
			System.out.println("FAIL:: Login button is Disabled");
		}

		//close the browser and stop the server
		driver.quit();
	}

}
