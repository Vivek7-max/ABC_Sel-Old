package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S11_UsageOfGetAttributeMethod2 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/slider");

		//getAttribute(String attName)
		String actualPointerValue = driver.findElement(By.cssSelector("input[type='range']")).getAttribute("value");
		String expectedPointerValue = "25";
		//The name of the attribute can be - 'value'
		//Even the attribute value is number, getAttribute() returns string

		//Print actual and expected values
		System.out.println("actualPointerValue: "+actualPointerValue);
		System.out.println("expectedPointerValue: "+expectedPointerValue);

		//Verification
		if(actualPointerValue.equals(expectedPointerValue)) {
			System.out.println("PASS:: Pointer values is correct and it is verified");
		}else {
			System.out.println("FAIL:: Pointer values is not correct and it is verified");
		}

		//close the browser and stop the server
		driver.quit();
	}

}
