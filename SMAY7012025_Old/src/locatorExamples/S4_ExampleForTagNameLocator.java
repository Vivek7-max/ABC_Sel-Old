package locatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4_ExampleForTagNameLocator {

	public static void main(String[] args) {
		//Open Browser and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		driver.findElement(By.tagName("a")).click();
		//tagName(String tagName) is the static method present in the By class
		// It is used to locate the web element using the tagName attribute
		// It accepts the tagName of the element in the form of String as parameter
		// Return type of this method is By class type of object
		// Usually this locator strategy is used to identify the multiple elements

		//Close the browser and stop the server
		driver.quit();
	}

}
