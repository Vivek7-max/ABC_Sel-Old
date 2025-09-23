package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class S01_OpenBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//IllegalStateException(java Exception) => When we make mistake in the key or value
		
		//To launch the browser -
		ChromeDriver driver = new ChromeDriver();
		
	}
}
