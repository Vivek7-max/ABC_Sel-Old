package test;

import java.util.List; 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/login/");

		WebElement parentEle = driver.findElement(By.id("login_form"));
		
		parentEle.findElement(By.name("email")).sendKeys("test@gmail.com");		
		parentEle.findElement(By.name("pass")).sendKeys("Sheela@123");
		
		
		parentEle.findElement(By.name("login")).click();
	
	}

}
