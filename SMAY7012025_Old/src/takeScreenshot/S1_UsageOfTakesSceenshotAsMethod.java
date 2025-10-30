package takeScreenshot;

import java.io.File; 
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1_UsageOfTakesSceenshotAsMethod {

	public static void main(String[] args) throws IOException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
	
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("Vivek.png");
		
		FileUtils.copyFile(tempFile,destFile);
		
		
		driver.quit();
	}
}
