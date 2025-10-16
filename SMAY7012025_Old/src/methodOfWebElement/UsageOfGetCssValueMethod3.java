package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCssValueMethod3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		WebElement heading = driver.findElement(By.tagName("h1"));
		
		String expectedFontWeight = "700";
		
		String actualFontWeight = heading.getCssValue("font-weight");
		
		System.out.println("expectedFontWeight: "+expectedFontWeight);
		System.out.println("actualFontWeight: "+actualFontWeight);
		
		if(actualFontWeight.equals(expectedFontWeight)) {
			System.out.println("PASS:: Font weight of the heading is correct");
		}else {
			System.out.println("FAIL:: Font weight of the heading is not correct");
		}
		
		driver.quit();
	}
}
