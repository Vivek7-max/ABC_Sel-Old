package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S6_UsageOfFindElementsMethod6 {
//Print first or last auto suggestion
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		 
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(3000);
		
		List<WebElement> allSuggetions = driver.findElements(By.xpath("//li[@role='presentation' and not(@id)]"));
		
		
//		System.out.println(allSuggetions.get(0).getText()); //first suggestion
		
		System.out.println(allSuggetions.get(allSuggetions.size()-1).getText()); //last suggetion
		
//		System.out.println(allSuggetions.getFirst().getText()); //alternative
//		System.out.println(allSuggetions.getLast().getText()); //alternative
		
		driver.quit();

	}

}
