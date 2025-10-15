package locatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S5_ExamplForLinkText {

	public static void main(String[] args) {
		//Open Browser and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");

		driver.findElement(By.linkText("Already have an account?")).click();
		// Text present in the a tag is known as link text
		//for the linkText() it is mandatory to pass full link text else we get NoSuchElement
		//linkText(String text) is the static method present in the By class
		// It is used to locate the web element using the link text
		// It accepts the link text of the element in the form of String as parameter
		// Return type of this method is By class type of object
		
		//Close the browser and stop the server
		driver.quit();
	}

}
