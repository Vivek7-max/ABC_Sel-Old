package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURLsOfOpendWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Elemental Selenium")).click();
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();
		
		for(String id :handles) {
			driver.switchTo().window(id);
			System.out.println(driver.getCurrentUrl());
			
		}
	}

}
