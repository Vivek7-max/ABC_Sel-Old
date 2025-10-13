package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTextMethod2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		String actualText = driver.findElement(By.tagName("h1")).getText();
		
		String expctedText = "That's it";
		
		if(actualText.contains(expctedText)) {
			System.out.println("Expected text is present in the element");
		}else {
			System.out.println("Expected text is not present in the element");
		}
		
		driver.quit();

	}

}
