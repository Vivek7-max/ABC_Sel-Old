package methodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class S05_UsageOfGetPageSourceMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String pageSource = driver.getPageSource();
		//getPageSourceMethod
		//1. It is used to get the source code of the web page
		//2. No arg. Method
		//3. return Type is String will return source code of the web page as string
		
		System.out.println(pageSource);

		String expectedText = "All rights reserved";
		
		if(pageSource.contains(expectedText)) {
			System.out.println("PASS:: Page source code contains expected text");
		}else {
			System.out.println("FAIL:: Page source code does not contains expected text");
		}
		driver.close();



	}

}
