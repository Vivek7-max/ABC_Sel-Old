package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class S22_UsageOfgetCookiesMethod2 {
//Get the cookies from myntra.com
	public static void main(String[] args) {
		//Launch Browser, Maximize Browser Window and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myntra.com");

		//Get set of cookies using getCookies()
		Set<Cookie> allCookies = driver.manage().getCookies();
		//No Arg method
		//Returns the generic collection of Cookie type
		//Cookie is class from Selenium library provides methods to get the properties of cookies

		//Iterate allCookies and print properties of cookies like- Name, Value, Domain, ExpireDate
		for (Cookie cookie : allCookies) {
			System.out.println(cookie.getName()+" || "+cookie.getDomain()+" || "+cookie.getExpiry());
		}

		//Close the browser and stop the server		
		driver.quit();

	}

}
