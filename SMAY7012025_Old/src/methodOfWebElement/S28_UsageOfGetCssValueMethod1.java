package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class S28_UsageOfGetCssValueMethod1 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		//Find the element for which need to check the CSS properties
		WebElement createAccountButton = driver.findElement(By.linkText("Create new account"));
		
		String exptectedRgb = "rgb(66, 183, 42)";
		
		//getCssValue() will always returns the RGBA value of color
		String Rgba = createAccountButton.getCssValue("background-color");
		
		//In Selenium we have color class
		//fromString(String rgba) - accepts the RGBA in the form of Sting
		//formString() returns the Color type of object
		//asRgb() is non static method present in the Color class
		//asRgb() returns the RGB Value of the CSS property 
		String acturlRgb = Color.fromString(Rgba).asRgb();
		
		//Print expected and actual values
		System.out.println("exptectedRgb: "+exptectedRgb);
		System.out.println("actualRgb: "+acturlRgb);
		
		//Verification
		if(acturlRgb.equals(exptectedRgb)) {
			System.out.println("PASS:: Backgroudnd color of the create account button is correct");
		}else {
			System.out.println("FAIL:: Backgroudnd color of the create account button is not correct");
		}
		
		//close the browser and stop the server
		driver.quit();
	}

}
