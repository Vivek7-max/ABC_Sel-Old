package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3_UsageOfTakesSceenshotAsMethod3 {
//Program to store the screenshot in the folder
	public static void main(String[] args) throws IOException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("./errorshots/orangeHRM.png");
		// after each execution file will be updated instead of storing it 
		// it will not store the all files if the file name is same for each execution
		
		FileUtils.copyFile(tempFile, destFile);
		
		driver.quit();

	}

}
