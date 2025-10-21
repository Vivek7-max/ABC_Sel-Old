package methodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class S05_UsageOfGetPageSourceMethod {
	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String pageSource = driver.getPageSource();
		//getPageSourceMethod
		//1. It is used to get the source code of the web page
		//2. No arg. Method
		//3. return Type is String will return source code of the web page as string

		//Print the page source 
		System.out.println(pageSource);

		String expectedText = "All rights reserved";

		//Verify the expected text is present in the page source
		if(pageSource.contains(expectedText)) {
			System.out.println("PASS:: Page source code contains expected text");
		}else {
			System.out.println("FAIL:: Page source code does not contains expected text");
		}

		//close the browser and stop the server
		driver.quit();



	}

}
