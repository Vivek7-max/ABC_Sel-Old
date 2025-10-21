package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S20_UsageOfIsEnabledMethod5 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/wishlist");
		
		//find the element which needs to check enabled or disabled
		WebElement continueButton =  driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		
		//get the class attribute of the button as it contains disable text
		String classAttValue = continueButton.getAttribute("class");
		
		//Verification: verify inability before clicking check box
		if(classAttValue.contains("disabled")) {
			System.out.println("PASS:: Button is disabled before checking the checkbox");
		}else {
			System.out.println("FAIL:: Button is Enable before checking the checkbox");
		}
		
		//click on check box
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//get the class attribute of the button again
		classAttValue = continueButton.getAttribute("class");
		
		//Verification: verify inability after clicking check box
		if(!classAttValue.contains("disabled")) {
			System.out.println("PASS:: Button is Enabled after checking the checkbox");
		}else {
			System.out.println("FAIL:: Button is Disable after checking the checkbox");
		}
		
		//close the browser and stop the server
		driver.quit();
	}
}
