package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class S12_UsageOfWindowMethod5 {
//set the Position (xCo & yCo in pixels) of browser window
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Point targetPosition = new Point(500, 20);
		//setPosition() will accept the parameter of Point class
		//from Point class create object and pass xCo and yCo in the constructor
		
		driver.manage().window().setPosition(targetPosition);
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
