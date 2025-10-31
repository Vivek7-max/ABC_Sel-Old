package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S6_UsageOfTakesSceenshotAsMethodForWebElement {
//Program to capture the screenshot of the web element with time stamp
	public static void main(String[] args) throws IOException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		//getScreenshotAs() can be used with the WebElement reference as
		//this method is inherited from TakesScreenshot interface to WebElement interface
		File tempFile = driver.findElement(By.tagName("h1")).getScreenshotAs(OutputType.FILE);
		
		 String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		  
		  File destFile = new File("./errorshots/SeleniumHeading"+timeStamp+".jpg");
		  
		  FileUtils.copyFile(tempFile, destFile);
		  
		  driver.quit();

	}

}
