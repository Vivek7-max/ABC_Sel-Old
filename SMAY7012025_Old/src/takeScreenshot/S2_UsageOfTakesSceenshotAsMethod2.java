package takeScreenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2_UsageOfTakesSceenshotAsMethod2 {
//Program to see where the screenshot will be stored in the temp file
	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		System.out.println(temp.getAbsolutePath()); 
		//getAbsolutePath() will return the exact path of the file
		//At this location file will be stored temporarily
		
		Thread.sleep(10000);
		
		//close the browser and stop the server
		driver.quit();
		

	}

}
