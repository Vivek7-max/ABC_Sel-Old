package methodsOfWebDriver;

import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class S19_PrintTitelOfAllWindowsInAlphabaticalOrder {
	public static void main(String[] args) throws InterruptedException {
		//set properties of driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch The browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Navigate To URL
		driver.get("https://the-internet.herokuapp.com/windows");
		
		//Click on 'ClickHere' & 'ElementalSelenium' link
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Elemental Selenium")).click();
		Thread.sleep(2000);
		
		//Get all window IDS
		Set<String> allWindowIds = driver.getWindowHandles();
		
		TreeSet<String> allTitles = new TreeSet<String>();
		
		//Iterate Window IDs
		for(String id : allWindowIds) {
			driver.switchTo().window(id);
			allTitles.add(driver.getTitle());
		}
		
		//Iterate allTitles and print it
		for(String title : allTitles) {
			System.out.println(title);
		}
		
		//Close the browser and stop the server		
		driver.quit();

	}
}
