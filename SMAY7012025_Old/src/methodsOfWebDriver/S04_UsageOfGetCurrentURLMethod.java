package methodsOfWebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class S04_UsageOfGetCurrentURLMethod {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");

		//getCurrentURL() => no arg Method (return type: String) => currentURL of the application
		String actualUrl = driver.getCurrentUrl();

		//store String variable for expected URL
		String expectedUrl = "https://www.selenium.dev/";

		System.out.println("actualUrl = "+actualUrl);
		System.out.println("expectedUrl = "+expectedUrl);

		//Verification
		if(actualUrl.equals(expectedUrl)) { 
			System.out.println("PASS:: Successfully navigated to the expected URL");
		}else {
			System.out.println("FAIL:: not navigated to the expected URL");
		}

		//close the browser and stop the server
		driver.quit();

	}

}
