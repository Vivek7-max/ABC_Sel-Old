package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S16_UsageOfIsEnabledMethod1 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls?");
		
		//isEnabled() - No Arg method - return type is boolean
		//It is used to verify if element is enabled or not
		//verification: Check text field is enabled or not
		if(!driver.findElement(By.xpath("//input[@type='text']")).isEnabled()) {
			System.out.println("PASS:: Textfiled is disabled");
		}else {
			System.out.println("FAIL:: Textfiled is Enabled");
		}
		
		//close the browser and stop the server
		driver.quit();

	}

}
