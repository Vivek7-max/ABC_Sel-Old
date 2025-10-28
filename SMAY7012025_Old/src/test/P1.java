package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ibegin.tcsapps.com/candidate/register");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'skills')]")).sendKeys("Testing");
		
		
		List<WebElement> allSuggetions = driver.findElements(By.xpath("li[@data-ng-repeat='item in itemList']"));
		
				
	}

}
