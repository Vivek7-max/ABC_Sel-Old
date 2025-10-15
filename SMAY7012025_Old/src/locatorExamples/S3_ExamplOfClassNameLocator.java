package locatorExamples;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3_ExamplOfClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		//find the element using className locator
		driver.findElement(By.className("DocSearch-Button-Placeholder")).click();
		//className(String className) is the static method present in the By class
		// It is used to locate the web element using the className attribute
		// It accepts the classValue of the element in the form of String as parameter
		// Return type of this method is By class type of object

		//Close the browser and stop the server
		driver.quit();
	}
}
