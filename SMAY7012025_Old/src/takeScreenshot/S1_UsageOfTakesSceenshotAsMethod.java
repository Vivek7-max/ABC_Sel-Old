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
//Program to take the screenshot of the web page
	public static void main(String[] args) throws IOException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		//Downcast the driver reference to access the getScreenshotAs method
		//Down casting has to be done explicitly using type cast operator
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//getScreenshotAs method will accept the parameter as final variable of OutputType interface
		//OutputType is as interface which has FILE, BASE64, BYTES final variables, defines output type of screenshot
		//based on variable selection for argument it returns File, String, byte[] type of object for
		// FILE, BASE64, BYTES respectively
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		
		//File is built in class in java used to create the new file
		//accepts the parameter as the address/location of the file
		//if we not mentioned any path file will be stored in project
		
		File destFile = new File("Vivek.png");//file will be stored in project
		
		//copyFile is the method from built in FileUtils class of commons-io package
		//copyFile method is used to copy the given file to the mentioned new file path
		//In order to use the FileUtils class download the commons-io jar from MVN repository
		//add it to build path and import the class.
		FileUtils.copyFile(tempFile,destFile);
		
		//close the browser and stop the server
		driver.quit();
	}
}
