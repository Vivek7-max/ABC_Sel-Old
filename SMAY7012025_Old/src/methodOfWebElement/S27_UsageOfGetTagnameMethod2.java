package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S27_UsageOfGetTagnameMethod2 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(3000);
		
		//check box is not having input tag.
		WebElement femaleRadioButton = driver.findElement(By.id("female"));
		S26_Library.verifyEleSelection(femaleRadioButton);
		//Here we called verifyEleSelection() from the created library class 
		//mostly getTagName() will be used to handle the errors in the methods of library class

		//close the browser and stop the server
		driver.quit();

	}

}
