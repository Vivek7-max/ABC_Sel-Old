package methodsOfWebDriver;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class S25_UsageOfDeleteCookieNamedMethod {
//Delete the particular cookie from the googl.com web site
	public static void main(String[] args) throws InterruptedException {
		//Launch Browser, Maximize Browser Window and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");

		//store the name of the cookie which is to be deleted
		String cookieName = "AEC";

		//get all the cookies and verify given named cookie is present in the application
		boolean flag = false;
		Set<Cookie> allCookies = driver.manage().getCookies();
		for (Cookie cookie : allCookies) {
			if(cookie.getName().equals(cookieName)) {
				flag = true;
			}
		}
		if(flag) {
			System.out.println("Mentioned cookie is present in the application");
		}else {
			System.out.println("Mentioned cookie is not present in the application");
		}

		//delete the particular cookie using deleteCookieNamed()
		driver.manage().deleteCookieNamed(cookieName);
		Thread.sleep(3000);
		//It is parameterized method accepts cookie name in the form of String
		//It is used to delete the particular cookie

		//get all the cookies again and verify the cookie delete is not present in the application
		flag = false;
		allCookies = driver.manage().getCookies();
		for (Cookie cookie : allCookies) {
			if(cookie.getName().equals(cookieName)) {
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("PASS:: Mentioned cookie is not present in the application hence deleted successfully");
		}else {
			System.out.println("FAIL:: Mentioned cookes is present in the application hence not deleted");
		}

		//close browser and stop the server
		driver.quit();
	}

}
