package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTextMethod1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String actualText = driver.findElement(By.name("start")).getText();
		
		String exceptedText = "START";
		
		System.out.println("actualText: "+actualText);
		System.out.println("exceptedText: "+exceptedText);
		
		
		if(actualText.equalsIgnoreCase(exceptedText)) {
			System.out.println("PASS:: Text of the button is as expected");
		}else {
			System.out.println("FAIL:: Text of the button is not as expected");
		}
		driver.quit();
	}

}
