package findElements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1_UsageOfFindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int expectedCount = 5;
		int actualCount = allLinks.size();
		System.out.println("expectedCount: "+expectedCount);
		System.out.println("actualCount: "+actualCount);
		
		
		if(actualCount==expectedCount) {
			System.out.println("PASS:: count of weblements is correct");
		}else {
			System.out.println("FAIl:: count of weblements is not correct");
		}
		
		
		driver.quit();
		
		
		

	}

}
