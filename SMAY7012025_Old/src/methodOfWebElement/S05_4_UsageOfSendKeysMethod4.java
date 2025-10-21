package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S05_4_UsageOfSendKeysMethod4 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
		//sendKeys method will scroll the page till the element present in view port are
		driver.findElement(By.name("sView1:r1:0:city")).sendKeys("Bengaluru");
		
		//close the browser and stop the server
		driver.quit();

	}

}
