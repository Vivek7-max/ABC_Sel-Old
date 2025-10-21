package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S10_UsageOfGetAttributeMethod1 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);
		//getAttribute(String attName)
		String actualPlaceholder = driver.findElement(By.name("username")).getAttribute("placeholde");
		//This method accepts the argument attribute name for which value need to find in the form of String
		//Return type of this method is String - value of the attribute
		//If attribute name is incorrect of not present then returns null
		//If attribute name is present but not having any value then return empty string
		//It is always the best practice to do the null check when we use this method

		String exptextdPlaceholder = "Username";
		
		//Print actual and expected value
		System.out.println("actualPlaceholder: "+actualPlaceholder);
		System.out.println("exptextdPlaceholder: "+exptextdPlaceholder);

		//Verification
		if(actualPlaceholder!=null) {
			if(actualPlaceholder.equals(exptextdPlaceholder)) {
				System.out.println("PASS:: The placeholder is persent and having expected value");
			}else {
				System.out.println("FAIL:: The placeholder is persent and not having expected value");
			}
		}else {
			System.out.println("FAIL:: The attribute name is worng or not present");
		}

		//close the browser and stop the server
		driver.quit();
	}

}
