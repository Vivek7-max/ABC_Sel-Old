package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S04_UsageOfClickMethod4 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");

		//click on the company history link
		driver.findElement(By.linkText("Company History")).click();
		// click method will scroll the page till target element visible in the view port area


		//close the browser and stop the server
		driver.quit();
	}

}
