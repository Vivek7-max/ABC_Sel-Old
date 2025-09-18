package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheCountOfWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		
		int expctedCount = 2;
		
		int actualCount = driver.getWindowHandles().size();
		
		if(expctedCount == actualCount) {
			System.out.println("PASS:: Window Count is matching");
		}else {
			System.out.println("FAIL:: Window Count is not matching");
		}
		
		driver.quit();
	}
}
