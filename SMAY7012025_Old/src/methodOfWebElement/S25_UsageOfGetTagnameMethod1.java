package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S25_UsageOfGetTagnameMethod1 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		//getTagName() is used to get the tagname of the element
		//CSS selector expression will work without using the tagName in the syntax
		//But if any duplications are there, it is not recommended to use
		String tagName = driver.findElement(By.cssSelector("[alt='company-branding']")).getTagName();
		
		System.out.println(tagName);
		
		//close the browser and stop the server
		driver.quit();
	}

}

