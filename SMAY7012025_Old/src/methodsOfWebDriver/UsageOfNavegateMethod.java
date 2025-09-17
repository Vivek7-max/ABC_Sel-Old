package methodsOfWebDriver;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavegateMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.dassault-aviation.com/");
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.dassault-aviation.com/group/");
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.dassault-aviation.com/passion/");
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.quit();
		
		//navegate().to() 
		//1. it is used to navigate to the URL of the application with updated end points
		//2. navigat() is also used to perform the browser actions like - goBack / goForward / refresh the page
		//3. get() is not providing the facility to perform the browser actions (used to navigete to main URL of the application)
	}

}
