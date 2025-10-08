package locatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S8_ExampleForCssSelectorLocator2 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Sheela");
		
		driver.quit();
	}

}
