package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabledMethod5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/wishlist");
		
		WebElement continueButton =  driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		String classAttValue = continueButton.getAttribute("class");
		
		if(classAttValue.contains("disabled")) {
			System.out.println("PASS:: Button is disabled before checking the checkbox");
		}else {
			System.out.println("FAIL:: Button is Enable before checking the checkbox");
		}
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		classAttValue = continueButton.getAttribute("class");
		
		if(!classAttValue.contains("disabled")) {
			System.out.println("PASS:: Button is Enabled after checking the checkbox");
		}else {
			System.out.println("FAIL:: Button is Disable after checking the checkbox");
		}
		
		
		driver.quit();


	}

}
