package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S32_UsageOfGetLocationMethod {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//getPoint() - no Arg method - returns the Point class type of object
		Point point = driver.findElement(By.xpath("//button[@name='login']")).getLocation();
		
		int expectedX = 781;
		int expectedY = 280;
		
		//getX() of Point class returns the starting X co-ordinate of the web element
		int actualX = point.getX();
		
		//get/y() of Point class returns the starting Y co-ordinate of the web element
		int actualY = point.getY();
		
		//Print actual and expected values
		System.out.println("expectedX: "+expectedX+", "+"expectedY: "+expectedY);
		System.out.println("actualX: "+actualX+", "+"actualY: "+actualY);
		
		//Verification
		if(actualX==expectedX && actualY==expectedY) {
			System.out.println("PASS:: Location of the Login button is correct");
		}else {
			System.out.println("FAIL:: Location of the Login button is not correct");
		}
		
		//close the browser and stop the server
		driver.quit();
	}

}
