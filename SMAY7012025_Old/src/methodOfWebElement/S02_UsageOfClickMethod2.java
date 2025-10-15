package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S02_UsageOfClickMethod2 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		//click on male radio button
		driver.findElement(By.id("male")).click();
		//click() is used to perform the click action on the web element
		// It can click on any type of element - Button, Link, Text Field, Radio Button, Check Box
		Thread.sleep(4000);


		//close the browser and stop the server
		driver.quit();
		driver.quit();

	}

}
