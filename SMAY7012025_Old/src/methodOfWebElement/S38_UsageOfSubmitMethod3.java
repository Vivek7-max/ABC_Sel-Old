package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S38_UsageOfSubmitMethod3 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		driver.findElement(By.className("submit-btn")).submit();
		//here submit method will not work instead gives the exception - JavaScriptException
		//as button is not present in the form tag & not having attribute as type='submit'
		
	}
}
