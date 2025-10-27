package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S33_UsageOfGetRectMethod {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//getRect() - no Arg method - returns the Rectangle class type of object
		Rectangle rect = driver.findElement(By.xpath("//button[@name='login']")).getRect();
		
		//Rectangle is the class provides the facility to get the size and location of the web element
		System.out.println("X location: "+rect.getX());
		System.out.println("Y location: "+rect.getY());
		System.out.println("Width of Button: "+rect.getWidth());
		System.out.println("Height of Button: "+rect.getHeight());
		
		
		//close the browser and stop the server
		driver.quit();
		
	}

}
