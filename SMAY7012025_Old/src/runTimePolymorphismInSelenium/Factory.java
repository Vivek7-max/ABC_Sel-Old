package runTimePolymorphismInSelenium;

import org.openqa.selenium.WebDriver;

public class Factory {
	public static void test(WebDriver driver) {
		//code to verify the URL of application
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		String expectedUrl = "https://www.google.com/";

		String actualUrl = driver.getCurrentUrl();

		System.out.println("expectedUrl = "+expectedUrl);
		System.out.println("actualUrl = "+actualUrl);

		if(expectedUrl.equals(actualUrl)) {
			System.out.println("PASS:: URL is correct");
		}else {
			System.out.println("FAIL:: URL is not correct");
		}

		//code to verify the Title of application
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		String expecteTitle = "Google";

		String actualTitle = driver.getTitle();

		System.out.println("expecteTitle = "+expecteTitle);
		System.out.println("actualTitle = "+actualTitle);

		if(expecteTitle.equals(actualTitle)) {
			System.out.println("PASS:: Title is correct");
		}else {
			System.out.println("FAIL:: Title is not correct");
		}
		
		System.out.println("===============================");
		driver.quit();

	}
}
