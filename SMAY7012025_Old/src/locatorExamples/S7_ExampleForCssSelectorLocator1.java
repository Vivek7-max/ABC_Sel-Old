package locatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S7_ExampleForCssSelectorLocator1 {

	public static void main(String[] args) {
		//Open Browser and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
