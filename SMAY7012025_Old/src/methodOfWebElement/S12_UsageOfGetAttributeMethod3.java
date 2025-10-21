package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S12_UsageOfGetAttributeMethod3 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/slider");

		//getAttribute(String attName)
		String pointer = driver.findElement(By.cssSelector("input[type='range']")).getAttribute("value");
		//The name of the attribute can be - 'value'
		//Even the attribute value is number, getAttribute() returns string

		//Convert the String to int using parse method of Integer wrapper class
		int actualPointerValue = Integer.parseInt(pointer);

		int expectedPointerValue = 25;

		//Print actual and expected values
		System.out.println("actualPointerValue: "+actualPointerValue);
		System.out.println("expectedPointerValue: "+expectedPointerValue);

		//Verification
		if(actualPointerValue==expectedPointerValue) {
			System.out.println("PASS:: Pointer values is correct and it is verified");
		}else {
			System.out.println("FAIL:: Pointer values is not correct and it is verified");
		}

		//close the browser and stop the server
		driver.quit();
	}
}
