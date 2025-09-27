package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S6_ExamplForPartialLinkText {

	public static void main(String[] args) {
		//Open Browser and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");

		driver.findElement(By.partialLinkText("Already have an account?")).click();
		//partialLinkText(String fullOrPartialLinkText) is the static method present in the By class
		// It is used to locate the web element using the full or partial link text
		// It accepts the full or partial link text of the element in the form of String as parameter
		// Return type of this method is By class type of object
		driver.quit();
		
	}
}
