package locatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1_ExampleForIdLocator {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		
		//find the element using id locator
		driver.findElement(By.id("name")).sendKeys("Vivek");
		//id(String id) is the static method present in the By class
		// It is used to locate the web element using the id attribute
		// It accepts the id of the element in the form of String as parameter
		// Return type of this method is By class type of object
		
		driver.quit();
	}
}

//By class
		//1. It is the Abstract class present in the Selenium package
		//2. It has 8 static methods called as Locator methods
		
//findElement()
		//1. Present in the SearchContext interface of WebDriver hierarchy
		//2. it is parameterized method which accepts By type of parameter
		//3. Return type of the findElement() is WebElement type of Object 