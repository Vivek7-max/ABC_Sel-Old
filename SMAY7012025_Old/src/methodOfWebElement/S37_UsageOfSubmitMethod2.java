package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S37_UsageOfSubmitMethod2 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//find the element
		WebElement searchTbx = driver.findElement(By.name("q"));
		searchTbx.sendKeys("Sachin Tendulkar");
		//submit button can be used for the text field present in the form tag
		//it will submit the data to server 
		searchTbx.submit();
		
		Thread.sleep(5000);
		
		//close the browser and stop the server
		driver.quit();

	}

}
