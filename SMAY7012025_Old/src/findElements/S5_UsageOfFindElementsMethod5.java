package findElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S5_UsageOfFindElementsMethod5 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ibegin.tcsapps.com/candidate/register");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'skills')]")).sendKeys("Testing");
		
		Thread.sleep(3000);
		
		List<WebElement> allAutoSuggetions = driver.findElements(By.xpath("//li[@data-ng-repeat='item in itemList']"));
		
		ArrayList<String> actualOrder = new ArrayList<String>();
		
		for(WebElement ele : allAutoSuggetions) {
			actualOrder.add(ele.getText());
		}
		
		List<String> expectedOrder = new ArrayList<String>(actualOrder);
		Collections.sort(expectedOrder);
		
		System.out.println("actualOrder: "+actualOrder);
		System.out.println("expectedOrder: "+expectedOrder);
		
		if(actualOrder.equals(expectedOrder)) {
			System.out.println("PASS:: Elements are present in the Alphabetical order");
		}else {
			System.out.println("FAIL:: Elements are not present in the Alphabetical order");
		}
		
		driver.quit();
	}

}
