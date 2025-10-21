package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_UsgeOfClearMethod {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//find the element using locator strategy
		WebElement textField = driver.findElement(By.id("field1"));
		
		//clear() - no arg method. return type: void
		textField.clear();
		//it is used to clear the text present in the text field
		//It is suggested to use this method before using sendKeys()
		
		textField.sendKeys("Vivek");
		
		Thread.sleep(5000);
		
		//close the browser and stop the server
		driver.quit();

	}

}
