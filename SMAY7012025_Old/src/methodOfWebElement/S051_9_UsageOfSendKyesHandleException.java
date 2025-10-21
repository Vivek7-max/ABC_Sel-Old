package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S051_9_UsageOfSendKyesHandleException {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		String username = null;
		
		//IllegalArgumentException can be handled using null check
		
		if(username!=null) {
			driver.findElement(By.name("username")).sendKeys(username);
		}else {
			System.out.println("Username is not available, it is having null value");
		}
		
		//close the browser and stop the server
		driver.quit();

	}

}
