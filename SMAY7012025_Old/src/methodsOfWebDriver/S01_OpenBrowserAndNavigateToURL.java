package methodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class S01_OpenBrowserAndNavigateToURL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		//get() => Parameterized method accepting the application URL as String data type
		//1. To navigate the main URL of the application -
		driver.get("https://www.google.com/");

		//2. Important - Holds the control till web page is getting loaded fully 
		//3. WebDriverException -  If there is mistake in the URL syntax
		//4. InvalidArgumentException - If string passed in the argument is not URL
		
		//Extra - We get WebDriverException if we lost Internet connection in between the execution
	}

}
