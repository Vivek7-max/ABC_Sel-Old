package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabledMethod4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/wishlist");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		if(driver.findElement(By.xpath("//div[text()='CONTINUE']")).isEnabled()) {
			System.out.println("Enabled");
		}else {
			System.out.println("Disabled");
		}
		
		driver.quit();

	}

}
