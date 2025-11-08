package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_1 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://ibegin.tcsapps.com/candidate/register");

//		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[contains(@placeholder,'skills')]")).sendKeys("Testing");

//		Thread.sleep(3000);

		List<WebElement> allAutoSuggetions = driver.findElements(By.xpath("//li[@data-ng-repeat='item in itemList']"));
		
		for (WebElement ele : allAutoSuggetions) {
			System.out.println(ele.getText());
		}
		
		driver.quit();
	}

}
