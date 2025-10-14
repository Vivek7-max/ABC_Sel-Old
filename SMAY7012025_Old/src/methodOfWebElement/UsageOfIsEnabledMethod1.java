package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabledMethod1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls?");
		
		if(!driver.findElement(By.xpath("//input[@type='text']")).isEnabled()) {
			System.out.println("PASS:: Textfiled is disabled");
		}else {
			System.out.println("FAIL:: Textfiled is Enabled");
		}
		
		driver.quit();

	}

}
