package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S08_UsageOfGetTextMethod2 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		//getText() - No Arg. method (return type: String)
		String actualText = driver.findElement(By.tagName("h1")).getText();
		
		String expctedText = "That's it";
		
		//Print actual and expected values
		System.out.println("actualText: "+actualText);
		System.out.println("expctedText: "+expctedText);
		
		//Verification
		if(actualText.contains(expctedText)) {
			System.out.println("Expected text is present in the element");
		}else {
			System.out.println("Expected text is not present in the element");
		}
		
		//close the browser and stop the server
		driver.quit();

	}

}
