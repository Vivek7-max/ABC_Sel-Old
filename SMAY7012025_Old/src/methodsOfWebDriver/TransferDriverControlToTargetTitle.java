package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TransferDriverControlToTargetTitle {
//Verify the driver control is transfered to the expected title window or not
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
		String expectedTitle = "New Window";
		for(String id : handles) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			if(title.equals(expectedTitle)) {
				break;
			}
		}
		
		String exptedURL = "https://the-internet.herokuapp.com/windows/new";
		
		if(driver.getCurrentUrl().equals(exptedURL)) {
			System.out.println("PASS:: Matching with expted URL");
		}else {
			System.out.println("FAIL:: Not Matching wih expted URL");
		}
		
		driver.quit();
		
	}
}
