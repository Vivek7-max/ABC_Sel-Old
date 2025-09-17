package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfWindowMethod3 {
	//set the size (height & width in pixels) of browser window
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Dimension targetSize = new Dimension(2000, 3500);
		
		//getSize() will accept the parameter of Dimension class
		//from Dimension class create object and pass height and width in the constructor
		
		Thread.sleep(3000);
		driver.manage().window().setSize(targetSize);
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
