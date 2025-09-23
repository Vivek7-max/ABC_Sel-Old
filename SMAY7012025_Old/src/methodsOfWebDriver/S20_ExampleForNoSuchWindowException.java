package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class S20_ExampleForNoSuchWindowException {
//get NoSuchWindowException
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		
		driver.close();
		//Parent Window Closed as control present in parent window
		
		driver.getTitle();
		//Once the window is closed and if we use any WebDriver method 
		//then we get NoSuchWindowException

	}

}
