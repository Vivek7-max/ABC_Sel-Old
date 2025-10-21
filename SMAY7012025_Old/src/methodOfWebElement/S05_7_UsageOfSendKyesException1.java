package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S05_7_UsageOfSendKyesException1 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls?");
		
		//If the sendKeys() used on disabled element it gives - ElementNotInteractableException
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Vivek");
		
		//In this example input[type='text'] element is disabled
		
		//close the browser and stop the server
		driver.quit();

	}

}
