package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayedMethod2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.linkText("Blog")).click();
		
		if(driver.findElement(By.xpath("//h2[text()='Search This Blog']")).isDisplayed()) {
			System.out.println("PASS:: Expected text is displayed");
		}else {
			System.out.println("FAIL:: Expected text is not displayed");
		}
		
		driver.quit();

	}

}
