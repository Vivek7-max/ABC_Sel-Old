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
		//for the linkText() it is mandatory to pass full link text else we get NoSuchElement
		
		driver.quit();
	}

}
