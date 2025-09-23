package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class S27_DeleteParticularCookieUsingDeleteCookieMethod {
//Delete Particular cookie using deleteCookie method
	public static void main(String[] args) throws InterruptedException {
		//Launch Browser, Maximize Browser Window and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");

		//Store the cookie name for which properties need to be verified
		String cookieName = "AEC";

		//get the particular cookie using cookie name
		Cookie cookie = driver.manage().getCookieNamed(cookieName);
		
		//Delete particular cookie using delelteCookie()
		driver.manage().deleteCookie(cookie);
		Thread.sleep(3000);
		//It is parameterized method, accepts Cookie type of parameter
		//it is used to delete the particular cookie
		
		//get all cookies again, iterate the names and verify particular cookie is deleted successfully
		boolean flag = false;
		Set<Cookie> allCookies = driver.manage().getCookies();
		for (Cookie cookie2 : allCookies) {
			if(cookie2.getName().equals(cookieName)) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("PASS:: Given cookie is not present hence deleted successfully");
		}else {
			System.out.println("FAIL:: Given cookie is present hence not deleted");
		}
		
		//Close browser and stop the server
		driver.quit();
	}

}
