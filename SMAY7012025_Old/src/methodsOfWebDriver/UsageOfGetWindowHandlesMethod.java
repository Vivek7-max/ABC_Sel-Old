package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandlesMethod {
//To print the window IDs for each opened window
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
		//getWindowHandles
		//1. It is used to get the window Id for all opened windows
		//2. Return Type is set of String (window ID)
		//3. The order of insertion is not maintained
		for(String id : handles) {
			System.out.println(id);
		}
		
		driver.quit();
	}

}
