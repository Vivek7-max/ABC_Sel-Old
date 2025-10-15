package locatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2_ExampleForNameLocator {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		//find the element using name locator
		WebElement ele = driver.findElement(By.name("login"));
		ele.click();
		//name(String name) is the static method present in the By class
		// It is used to locate the web element using the name attribute
		// It accepts the nameValue of the element in the form of String as parameter
		// Return type of this method is By class type of object

		//Close the browser and stop the server
		driver.quit();
	}

}
