package sychronization;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//implicit wait
public class S3_LearnSynchronization3 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://ibegin.tcsapps.com/candidate/register");

		driver.findElement(By.xpath("//input[contains(@placeholder,'skills')]")).sendKeys("Testing");


		List<WebElement> allAutoSuggetions = driver.findElements(By.xpath("//li[@data-ng-repeat='item in itemList']"));
		
		for (WebElement ele : allAutoSuggetions) {
			System.out.println(ele.getText());
		}
		
		driver.quit();
	}

}
