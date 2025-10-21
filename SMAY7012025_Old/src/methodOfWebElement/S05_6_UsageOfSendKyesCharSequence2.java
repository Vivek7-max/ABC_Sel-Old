package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S05_6_UsageOfSendKyesCharSequence2 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		//sendKeys method accepts the parameter in the form of variable Arguments
		//One/many data can be given as parameter
		//The data will be entered into the text field one after another
		driver.findElement(By.name("username")).sendKeys("Sheela", "Meena", "Teena");
		
		//close the browser and stop the server
		driver.quit();
	}

}
