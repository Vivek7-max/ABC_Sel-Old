package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocationMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Point point = driver.findElement(By.xpath("//button[@name='login']")).getLocation();
		
		int expectedX = 781;
		int expectedY = 280;
		
		int actualX = point.getX();
		int actualY = point.getY();
		
		
		System.out.println("expectedX: "+expectedX+", "+"expectedY: "+expectedY);
		System.out.println("actualX: "+actualX+", "+"actualY: "+actualY);
		
		if(actualX==expectedX && actualY==expectedY) {
			System.out.println("PASS:: Location of the Login button is correct");
		}else {
			System.out.println("FAIL:: Location of the Login button is not correct");
		}
		
		driver.quit();
	}

}
