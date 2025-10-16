package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetRectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Rectangle rect = driver.findElement(By.xpath("//button[@name='login']")).getRect();
		
		System.out.println("X location: "+rect.getX());
		System.out.println("Y location: "+rect.getY());
		System.out.println("Width of Button: "+rect.getWidth());
		System.out.println("Height of Button: "+rect.getHeight());
		
		driver.quit();
		
	}

}
