package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();

		driver.get("https://www.udemy.com/");
		
		driver.findElement(By.name("q")).sendKeys("Java");
		
		Thread.sleep(8000);
		
		driver.quit();

	}

}
