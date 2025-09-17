package methodsOfWebDriver;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfWindowMethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Options options = driver.manage();
		
		//manage() will return Options type of object
		//Using window() from Options interface we can perform window related operations
		
		
		Window window = options.window();	
		//window() will return Window interface
		
		window.maximize(); //maximize() => used to maximize the browser window
		Thread.sleep(3000);
		
		window.fullscreen(); //fullScreen() => used for see the full browser window
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
