package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelectedMethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(1000);
		
		WebElement femaleRadioButton = driver.findElement(By.id("female"));

		if(!femaleRadioButton.isSelected()) {
			System.out.println("PASS:: Radio button is not selected before clicking");
		}else {
			System.out.println("FAIL:: Radio button is selected before clicking");
		}
		
		//click on radio button
		femaleRadioButton.click();
		if(femaleRadioButton.isSelected()) {
			System.out.println("PASS:: Radio button selected after clicking");
		}else {
			System.out.println("FAIL:: Radio button not selected after clicking");
		}
		
		driver.quit();
		

	}

}
