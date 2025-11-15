package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://infinite-scroll.com/demo/full-page/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//a[text()='Logo Pizza']")).click();
				break;
			} catch (Exception e) {
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("scrollBy(0,700)");
			}
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
