package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S31_UsageOfGetSizeMethod {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//getSize() - no Arg method - returns the Dimension class type of object
		Dimension dimension = driver.findElement(By.xpath("//button[@name='login']")).getSize();
		
		
		int expectedWidth = 364;
		int expectedHeight = 48;
		
		//getWidth() of Dimension class returns the width of element
		int actualWidth = dimension.getWidth();
		//getHeight() of Dimension class returns the height of element
		int actualHeight = dimension.getHeight();
		
		//Print both actual and expected values
		System.out.println("expectedWidth: "+expectedWidth+", "+"expectedHeight: "+expectedHeight);
		System.out.println("actualWidth: "+actualWidth+", "+"actualHeight: "+actualHeight);
		
		//Verification
		if(actualWidth==expectedWidth && actualHeight==expectedHeight) {
			System.out.println("PASS:: Size of the Login button is correct");
		}else {
			System.out.println("FAIL:: Size of the Login button is not correct");
		}
		
		//close the browser and stop the server
		driver.quit();
	}

}
