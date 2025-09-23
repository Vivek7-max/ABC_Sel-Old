package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class S09_UsageOfWindowMethod2 {
//Get the size (height & width in pixels) of browser window
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Dimension dimension = driver.manage().window().getSize();
		//getSize() will return Dimension class
		//from Dimension class we can call getHight() & getWidth()
		
		int hight = dimension.getHeight();
		
		int width = dimension.getWidth();
		
		System.out.println("hight = "+hight);
		System.out.println("width = "+width);
		
		driver.quit();
	}

}
