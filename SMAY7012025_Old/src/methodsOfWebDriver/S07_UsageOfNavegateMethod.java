package methodsOfWebDriver;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class S07_UsageOfNavegateMethod {
	
	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.dassault-aviation.com/");
		Thread.sleep(3000);
		
		//navigate() 
		Navigation navigation = driver.navigate();
		//navigate() will return the Navigation type of the object
		//Navigate is interface which provides the navigation methods - to(), back(), forward(), refresh()
		
		//to() => Used to navigate sub URL of the application
		navigation.to("https://www.dassault-aviation.com/group/");
		Thread.sleep(3000);
		
		navigation.to("https://www.dassault-aviation.com/passion/");
		Thread.sleep(3000);
		
		//back() => used to navigate the last navigated URL
		navigation.back();
		Thread.sleep(3000);
		
		//forward() => used to navigate the next URL which was already navigated
		navigation.forward();
		Thread.sleep(3000);
		
		//refresh() => It is used to refresh the browser window & re navigation will happen for the same URL
		navigation.refresh(); 
		Thread.sleep(3000);
		
		//close the browser and stop the server
		driver.quit();
		
	}

}
