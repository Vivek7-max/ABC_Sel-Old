package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();

		driver.get("https://www.seedr.cc/");
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("login-frame");
		
		Thread.sleep(2000);
		WebElement checkBox = driver.findElement(By.xpath("//input[@name='accept_terms']"));
		
		checkBox.click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='submit-email']")).submit();
		
		System.out.println("Done");
		
		
		
//		driver.quit();
	}

}
