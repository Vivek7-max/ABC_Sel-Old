package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S36_UsageOfSubmitMethod1 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		//Enter the user name into the user name text field
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		//Enter the password into the password text field
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		//submit() is used to submit the form
		driver.findElement(By.cssSelector("button[type='submit']")).submit();
		//this method is used for the button present in the form tag
		//the button should have the attribute as type='form'
		
		String exptextUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actualUrl = driver.getCurrentUrl();
		
		//verification for the form submission
		if(actualUrl.equals(exptextUrl)) {
			System.out.println("PASS:: Form Submitted Successfully");
		}else {
			System.out.println("FAIL:: Unable to submit the form");
		}
		
		//close the browser and stop the server
		driver.quit();
		
	}

}
