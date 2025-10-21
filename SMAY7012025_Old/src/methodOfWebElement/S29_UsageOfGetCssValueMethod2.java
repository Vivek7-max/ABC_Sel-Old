package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class S29_UsageOfGetCssValueMethod2 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		//Find the element for which need to check the CSS properties
		WebElement createAccountButton = driver.findElement(By.linkText("Create new account"));
		
		String expectedHexaCode = "#42b72a";
		
		//getCssValue() will always returns the RGBA value of color
		String rgba = createAccountButton.getCssValue("background-color");
		
		//In Selenium we have color class
		//fromString(String rgba) - accepts the RGBA in the form of Sting
		//formString() returns the Color type of object
		//asHex() is non static method present in the Color class
		//asHex() returns the HexaCode Value of the CSS property 
		String actualHexaCode = Color.fromString(rgba).asHex();
		
		System.out.println("expectedHexaCode: "+expectedHexaCode);
		System.out.println("actualHexaCode: "+actualHexaCode);
		
		//Verification
		if(actualHexaCode.equals(expectedHexaCode)) {
			System.out.println("PASS:: Backgroudnd color of the create account button is correct");
		}else {
			System.out.println("FAIL:: Backgroudnd color of the create account button is not correct");
		}
		
		//close the browser and stop the server
		driver.quit();
	}

}
