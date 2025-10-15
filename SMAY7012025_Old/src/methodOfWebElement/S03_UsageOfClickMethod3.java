package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S03_UsageOfClickMethod3 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");

		//click on the link
		driver.findElement(By.linkText("Messenger")).click();
		// click() is used to perform the click action on the web element
		// It can click on any type of element - Button, Link, Text Field, Radio Button, Check Box
		// click method will scroll the page till target element visible in the view port area
		
		//close the browser and stop the server
		driver.quit();


	}

}
