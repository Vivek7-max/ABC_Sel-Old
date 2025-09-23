package methodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class S24_UsageOfDeleteAllCookiesMethod2 {
//Delete all the cookies from google.com web site and verify cookies are deleted using count of cookies
	public static void main(String[] args) throws InterruptedException {
		//Launch Browser, Maximize Browser Window and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		//Get the count of cookies before deleting the cookies
		int cookiesCountBeforeDelete = driver.manage().getCookies().size();
		
		Thread.sleep(5000);
		//Delete all the cookies
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		
		//Get the count of cookies after deleting the cookies
		int cookiesCountAfterDelete = driver.manage().getCookies().size();
		
		//Print cookies count
		System.out.println("cookiesCountBeforeDelete = "+cookiesCountBeforeDelete);
		System.out.println("cookiesCountAfterDelete = "+cookiesCountAfterDelete);
		
		//Verify cookies are deleted or not using count of cookies
		if (cookiesCountAfterDelete==0) {
			System.out.println("PASS:: Cookie count is zero hence all cookies are deleted successfully");
		}else {
			System.out.println("FAIL:: Cookie count is not zero hence cookies are not deleted");
		}
		
		//close browser and stop the server
		driver.quit();

	}

}
