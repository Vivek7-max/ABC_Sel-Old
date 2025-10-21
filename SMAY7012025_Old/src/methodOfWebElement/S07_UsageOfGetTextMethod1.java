package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S07_UsageOfGetTextMethod1 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		//getText() - No Arg. method (return type: String)
		String actualText = driver.findElement(By.name("start")).getText();
		//returns the text of the web element
		//Text can be normal text or link text
		//If no text available returns empty string

		String exceptedText = "START";

		//Print actual and expected values
		System.out.println("actualText: "+actualText);
		System.out.println("exceptedText: "+exceptedText);

		//Verification
		if(actualText.equalsIgnoreCase(exceptedText)) {
			System.out.println("PASS:: Text of the button is as expected");
		}else {
			System.out.println("FAIL:: Text of the button is not as expected");
		}
		
		//close the browser and stop the server
		driver.quit();
	}

}
