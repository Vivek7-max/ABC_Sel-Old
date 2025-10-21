package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S30_UsageOfGetCssValueMethod3 {
	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		//Find the element for which need to check the CSS properties
		WebElement heading = driver.findElement(By.tagName("h1"));
		
		String expectedFontWeight = "700";
		
		//getCssValue() will always returns the CSS value of the mentioned CSS property
		String actualFontWeight = heading.getCssValue("font-weight");
		
		//Print the expected and actual values
		System.out.println("expectedFontWeight: "+expectedFontWeight);
		System.out.println("actualFontWeight: "+actualFontWeight);
		
		//Verification
		if(actualFontWeight.equals(expectedFontWeight)) {
			System.out.println("PASS:: Font weight of the heading is correct");
		}else {
			System.out.println("FAIL:: Font weight of the heading is not correct");
		}
		
		//close the browser and stop the server
		driver.quit();
	}
}
