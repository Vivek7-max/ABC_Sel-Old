package methodsOfWebDriver;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class S26_UsageOfGetCookieNamed {
//Verify the given cookie is HttpOnly and secure or not
	public static void main(String[] args) {
		//Launch Browser, Maximize Browser Window and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");

		//Store the cookie name for which properties need to be verified
		String cookieName = "AEC";

		//get the particular cookie using cookie name
		Cookie cookie = driver.manage().getCookieNamed(cookieName);

		//Verify the properties of given cookie
		if(cookie.isHttpOnly() && cookie.isSecure()) {
			System.out.println("PASS:: Given cookie is HTTP Only and Secure");
		}else {
			System.out.println("FAIL:: Given cookie is not HTTP Only and Secure");
		}

		//close browser and stop the server
		driver.quit();

	}

}
