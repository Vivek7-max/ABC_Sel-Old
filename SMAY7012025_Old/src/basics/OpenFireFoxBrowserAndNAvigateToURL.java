package basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxBrowserAndNAvigateToURL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		//if there is mismatch for browser version then
		//we get SessionNotCreatedException
		//How to handle it? => simply update the browser version
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
