package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3_UsageOfFindElementMethod3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for')]")).sendKeys("tshirt");
		
		Thread.sleep(3000);
		
		List<WebElement> allTshitSuggetions = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		
		String exptectedSuggestion = "Tshirts Women";
		
		for (WebElement ele : allTshitSuggetions) {
			if(ele.getText().equals(exptectedSuggestion)) {
				ele.click();
				break;
			}
		}
		
		String currentUrl = driver.getCurrentUrl();
		String urlFraction = "tshirts-women?";
		
		if(currentUrl.contains(urlFraction)) {
			System.out.println("PASS:: Clicked on expected suggetion");
		}else {
			System.out.println("FAIL:: Unable to click on expected suggetion");
		}
		
		driver.quit();
		
	}

}
