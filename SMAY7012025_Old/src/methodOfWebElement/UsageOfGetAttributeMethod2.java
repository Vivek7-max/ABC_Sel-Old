package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttributeMethod2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/slider");
		
		String actualPointerValue = driver.findElement(By.cssSelector("input[type='range']")).getAttribute("value");
		String expectedPointerValue = "25";
		
		System.out.println("actualPointerValue: "+actualPointerValue);
		System.out.println("expectedPointerValue: "+expectedPointerValue);
		
		if(actualPointerValue.equals(expectedPointerValue)) {
			System.out.println("PASS:: Pointer values is correct and it is verified");
		}else {
			System.out.println("FAIL:: Pointer values is not correct and it is verified");
		}
		
		driver.quit();
	}

}
