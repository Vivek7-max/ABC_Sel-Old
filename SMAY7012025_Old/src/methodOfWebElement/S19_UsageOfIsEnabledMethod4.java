package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S19_UsageOfIsEnabledMethod4 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/wishlist");

		//Click on check box
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		//isEnabled() - No Arg method - return type is boolean
		//It is used to verify if element is enabled or not
		//verification
		if(driver.findElement(By.xpath("//div[text()='CONTINUE']")).isEnabled()) {
			System.out.println("Enabled");
		}else {
			System.out.println("Disabled");
		}

		//In this example isEnable() will not work as per expectation
		//Because element is not made up of input tag
		
		//close the browser and stop the server
		driver.quit();

	}

}
