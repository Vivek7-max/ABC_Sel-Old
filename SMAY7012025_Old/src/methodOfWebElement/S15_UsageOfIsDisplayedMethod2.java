package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S15_UsageOfIsDisplayedMethod2 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Click on block link
		driver.findElement(By.linkText("Blog")).click();
		
		//isDisplayed() - No Arg method - return type is boolean
		//Verification
		if(driver.findElement(By.xpath("//h2[text()='Search This Blog']")).isDisplayed()) {
			System.out.println("PASS:: Expected text is displayed");
		}else {
			System.out.println("FAIL:: Expected text is not displayed");
		}
		
		//close the browser and stop the server
		driver.quit();

	}

}
