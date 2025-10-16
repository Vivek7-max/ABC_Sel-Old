package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSizeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Dimension dimension = driver.findElement(By.xpath("//button[@name='login']")).getSize();
		
		
		int expectedWidth = 364;
		int expectedHeight = 48;
		
		int actualWidth = dimension.getWidth();
		int actualHeight = dimension.getHeight();
		
		
		System.out.println("expectedWidth: "+expectedWidth+", "+"expectedHeight: "+expectedHeight);
		System.out.println("actualWidth: "+actualWidth+", "+"actualHeight: "+actualHeight);
		
		if(actualWidth==expectedWidth && actualHeight==expectedHeight) {
			System.out.println("PASS:: Size of the Login button is correct");
		}else {
			System.out.println("FAIL:: Size of the Login button is not correct");
		}
		
		driver.quit();
	}

}
