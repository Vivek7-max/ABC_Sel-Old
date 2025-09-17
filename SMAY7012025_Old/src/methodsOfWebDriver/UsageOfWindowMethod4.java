package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfWindowMethod4 {
//Get the Position (xCo & yCo in pixels) of browser window
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Point point = driver.manage().window().getPosition();
		//getPosition() will return Point class
		//from Point class we can call getX() & getY()
		
		int xCo = point.getX();
		int yCo = point.getY();
		
		System.out.println("xCo = "+xCo);
		System.out.println("yCo = "+yCo);
	}

}
