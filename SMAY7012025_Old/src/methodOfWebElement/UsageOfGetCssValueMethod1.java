package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class UsageOfGetCssValueMethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		WebElement createAccountButton = driver.findElement(By.linkText("Create new account"));
		
		String exptectedRgb = "rgb(66, 183, 42)";
		
		//getCssValue() will always returns the RGBA value of color
		String Rgba = createAccountButton.getCssValue("background-color");
		
		String acturlRgb = Color.fromString(Rgba).asRgb();
		
		System.out.println("exptectedRgb: "+exptectedRgb);
		System.out.println("actualRgb: "+acturlRgb);
		
		if(acturlRgb.equals(exptectedRgb)) {
			System.out.println("PASS:: Backgroudnd color of the create account button is correct");
		}else {
			System.out.println("FAIL:: Backgroudnd color of the create account button is not correct");
		}
		
		driver.quit();
	}

}
