package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentWindow {
//Close the windows opened other than parent window
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Elemental Selenium")).click();
		Thread.sleep(2000);
		
		String parentWindowID = driver.getWindowHandle();
		
		Set<String> handles = driver.getWindowHandles();
		handles.remove(parentWindowID);
		
		for(String id : handles) {
			driver.switchTo().window(id);
			driver.close();
		}
		

	}

}
