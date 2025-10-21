package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S22_UsageOfIsSelectedMethod1 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(1000);
		//Find element which need to check for selected or not
		WebElement femaleRadioButton = driver.findElement(By.id("female"));
		
		//Verification: Check radio button is selected or not before clicking on radio button
		if(!femaleRadioButton.isSelected()) {
			System.out.println("PASS:: Radio button is not selected before clicking");
		}else {
			System.out.println("FAIL:: Radio button is selected before clicking");
		}
		
		//click on radio button
		femaleRadioButton.click();
		
		//Verification: Check radio button is selected or not after clicking on radio button
		if(femaleRadioButton.isSelected()) {
			System.out.println("PASS:: Radio button selected after clicking");
		}else {
			System.out.println("FAIL:: Radio button not selected after clicking");
		}
		
		//close the browser and stop the server
		driver.quit();
		

	}

}
