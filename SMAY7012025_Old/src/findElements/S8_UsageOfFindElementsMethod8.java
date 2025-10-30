package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S8_UsageOfFindElementsMethod8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).click();
	

		Thread.sleep(3000);
		
		List<WebElement> allSuggetions = driver.findElements(By.xpath("//Vivek"));
		//if the locator is not matching then findElements() returns empty string
		
		System.out.println(allSuggetions.isEmpty()); //true
		
//		for (WebElement ele : allSuggetions) {
//			System.out.println(ele.getText());
//		}
		
		driver.quit();

	}

}
