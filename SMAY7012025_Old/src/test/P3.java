package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		
		WebElement searchTbx = driver.findElement(By.xpath("//textarea[@name='q']"));
//		searchTbx.sendKeys("Sachin Tendulkar");
		Thread.sleep(3000);
		searchTbx.submit();
		
		driver.quit();
	}
}
