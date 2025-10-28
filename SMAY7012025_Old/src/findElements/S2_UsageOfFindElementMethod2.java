package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2_UsageOfFindElementMethod2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(3000);
		
		List<WebElement> allAutoSuggetions = driver.findElements(By.xpath("//li[@class='sbct PZPZlf' and not(@id)]"));
		
		System.out.println(allAutoSuggetions.size());
		
		int expectedCount = 10;
		
		if(allAutoSuggetions.size()>0 && allAutoSuggetions.size()<=expectedCount) {
			System.out.println("PASS:: Count of autosuggetion is correct");
		}else {
			System.out.println("FAIL:: Count of autosuggetion is not correct");
		}
		
		driver.quit();

	}

}
